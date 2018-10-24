package hackathon2018.multiplayerlife.entities;

import hackathon2018.functions.UtilsFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Game {

    private static final AtomicLong idCounter = new AtomicLong(0);

    private final long id = idCounter.getAndIncrement();
    private final Player[] players = new Player[4];
    private final Object mutex = new Object();
    private LifeState state;

    public long getId() {
        return id;
    }

    public boolean addPlayer(final Player player) {
        synchronized (mutex) {
            for (int i = 0; i < players.length; i++) {
                if (players[i] == null) {
                    players[i] = player;
                    setColor(player, i);
                    return true;  // return true if player was successfully added (enough space in game)
                }
            }
            return false;
        }
    }

    private void setColor(final Player player, final int i) {
        switch (i) {
            case 0:
                player.setColor(Color.RED);
                break;
            case 1:
                player.setColor(Color.GREEN);
                break;
            case 2:
                player.setColor(Color.BLUE);
                break;
            case 3:
                player.setColor(Color.YELLOW);
                break;
        }
    }

    public List<Player> getPlayers() {
        final ArrayList<Player> list = new ArrayList<>();
        synchronized (mutex) {
            for (final Player player : players) {
                if (player == null) {
                    break;
                }
                list.add(player);
            }
        }
        return list;
    }

    public List<Player.Status> getPlayerStatuses() {
        final List<Player.Status> statusList = new ArrayList<>();
        synchronized (mutex) {
            for (final Player player : players) {
                if (player == null) {
                    break;
                }
                statusList.add(Player.Status.of(player));
            }
        }
        return statusList;
    }

    /**
     * Build State
     * call when all players are ready
     */
    public void buildState() {
        synchronized (mutex) {
            List<int[][]> listOfArrays = new ArrayList<>();
            for (final Player player : players) {
                if (player == null || player.getState().getData() == null) {break;}
                int[][] playerData = player.getState().getData();
                listOfArrays.add(playerData);
            }
            int[][] playersData = UtilsFunctions.combineToArrayBoolean(listOfArrays);
            this.state = new LifeState(playersData);
        }
    }

    public LifeState getState() {
        synchronized (mutex) {
            return state;
        }
    }

    /**
     * Get Player Results
     * @param state
     * @return
     */
    public List<Player.Result> getPlayerResults(final LifeState state) {
        final List<Player.Result> playerResults = new ArrayList<>();
//        List<int[][]> results = UtilsFunctions.splitToArraysBoolean(state.getData());
//        synchronized (mutex) {
//            int count = 0;
//            for (final Player player : players) {
//                if (results == null || player == null) {break;}
//                playerResults.add(Player.Result.of(player, new LifeState(results.get(count))));
//                count++;
//            }
//        }
        for (final Player player : players) {
            final LifeState playerState = LifeState.forColor(state, player.getColor());
            playerResults.add(Player.Result.of(player, playerState));
        }
        return playerResults;
    }

}
