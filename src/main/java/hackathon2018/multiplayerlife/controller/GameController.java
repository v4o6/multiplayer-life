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
    return "game";
  }

  @GetMapping("/game/data")
  @ResponseBody
  public LifeState getInitialData(@RequestParam("gameId") final long gameId) {
//    return gameService.getGame(gameId).getState();
    return new LifeState(new boolean[][] {
        {true, false, false, true, false, false, true, true, true, true, false, true, false, false, true, false},
        {false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, true},
        {false, false, true, true, true, false, false, true, true, false, false, true, false, false, true, true},
        {true, true, false, true, false, false, true, false, false, false, true, true, true, false, false, true},
        {false, false, true, true, true, false, false, true, true, true, false, true, false, false, true, false},
        {true, false, false, true, false, false, true, true, false, false, true, true, true, false, false, true},
        {false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, true},
        {true, true, false, true, false, false, true, false, true, false, false, true, false, false, true, true},
        {false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, true},
        {true, true, false, true, false, false, true, false, false, false, true, true, true, false, false, true},
        {true, false, false, true, false, false, true, true, false, false, true, true, true, false, false, true},
        {true, true, false, true, false, false, true, false, true, false, false, true, false, false, true, true},
        {false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, true},
        {false, false, true, true, true, false, false, true, true, true, false, true, false, false, true, false},
        {false, false, true, true, true, false, false, true, true, false, false, true, false, false, true, true},
        {true, false, false, true, false, false, true, true, true, true, false, true, false, false, true, false}
    });
  }

  @PostMapping("/game/submit")
  @ResponseBody
  public boolean submit(@RequestParam("gameId") final long gameId, @RequestParam("data") final String json) {
    final ObjectMapper mapper = new ObjectMapper();
    final boolean[][] data;
    try {
      data = mapper.readValue(json, boolean[][].class);
    }
    catch (final IOException e) {
      logger.error("invalid input", e);
      return false;
    }

    final LifeState state = new LifeState(data);
    // TODO kenny

    return true;
  }

}
