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
                    return true;  // return true if player was successfully added (enough space in game)
                }
            }
            return false;
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
            List<boolean[][]> listOfArrays = new ArrayList<>();
            for (final Player player : players) {
                if (player == null || player.getState().getData() == null) {break;}
                boolean[][] playerData = player.getState().getData();
                listOfArrays.add(playerData);
            }
            boolean[][] playersData = UtilsFunctions.combineToArrayBoolean(listOfArrays);
            this.state = new LifeState(playersData);
        }
    }

    public LifeState getState() {
        synchronized (mutex) {
            return state;
        }
    }

    public List<Player.Result> getPlayerResults(final LifeState state) {
        final List<Player.Result> playerResults = new ArrayList<>();
        List<boolean[][]> results = UtilsFunctions.splitToArraysBoolean(state.getData(), 8, 8);
        synchronized (mutex) {
            int count = 0;
            for (final Player player : players) {
                if (results == null || player == null) {break;}
                playerResults.add(Player.Result.of(player, new LifeState(results.get(count))));
                count++;
            }
        }
        return playerResults;
    }

}
