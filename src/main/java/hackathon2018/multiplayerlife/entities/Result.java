package hackathon2018.multiplayerlife.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Result {

    private final LifeState state;
    private final List<Player.Result> results;

    public Result(final Game game, final LifeState state) {
        this.state = state;
        this.results = game.getPlayerResults(state);
    }

    public LifeState getState() {
        return state;
    }

    public List<Player.Result> getResults() {
        return results;
    }

    public Player.Result getWinner() {
        List<Integer> list = new ArrayList<>();
        for (final Player.Result result : results) {
            list.add(result.getCount());
        }
        int maxCount = Collections.max(list);
        int indexOfMax = results.indexOf(maxCount);
        return results.get(indexOfMax);
    }

}
