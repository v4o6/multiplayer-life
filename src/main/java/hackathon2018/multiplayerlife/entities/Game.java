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

    // call when all players are ready

    /**
     * Build State
     */
    public void buildState() {
        synchronized (mutex) {
            List<boolean[][]> listOfArrays = new ArrayList<>();
            for (final Player player : players) {
                if (player == null ||
                        player.getState().getData() == null ||
                        player.getState().getData().length == 0 ||
                        player.getState().getData()[0].length == 0) {
                    break;
                }
                boolean[][] playerData = player.getState().getData();
                listOfArrays.add(playerData);
            }
            boolean[][] playersData = UtilsFunctions.combineToArrayBoolean(listOfArrays);
            setState(new LifeState(playersData));
        }
    }

    /**
     * Set State
     * @param state
     * @return
     */
    public boolean setState(LifeState state) {
        synchronized (mutex) {
            this.state = state;
            return true;
        }
    }

    public LifeState getState() {
        synchronized (mutex) {
            return state;
        }
    }

}
