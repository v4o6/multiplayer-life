package hackathon2018.multiplayerlife.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.entities.Result;
import hackathon2018.multiplayerlife.service.GameService;

@Controller
public class GameController {
  private static final Logger logger = LoggerFactory.getLogger(GameController.class);

  @Autowired
  private GameService gameService;

  @GetMapping("/game/{gameId}")
  public String game(@PathVariable final long gameId, final Model model) {
    model.addAttribute("gameId", gameId);
    final Game game = gameService.getGame(gameId);
    model.addAttribute("statuses", game.getPlayerStatuses());
    model.addAttribute("gameSize", gameService.getGameSize());
    return "game";
  }

  @GetMapping("/game/data")
  @ResponseBody
  public LifeState getInitialData(@RequestParam("gameId") final long gameId) {
    final LifeState state = gameService.getGame(gameId).getState();
    if (state == null) {
      logger.warn("game {} not ready yet", gameId);
    }

    return state;
  }

  @PostMapping("/game/submit")
  @ResponseBody
  public boolean submit(@RequestParam("gameId") final long gameId, @RequestParam("data") final String json) {
    final ObjectMapper mapper = new ObjectMapper();
    final int[][] data;
    try {
      data = mapper.readValue(json, int[][].class);
    }
    catch (final IOException e) {
      logger.error("invalid input", e);
      return false;
    }

    final LifeState state = new LifeState(data);
    Game game = gameService.getGame(gameId);
    Result result = new Result(game, state);
    gameService.writeGameResult(gameId, result);

    return true;
  }

}
