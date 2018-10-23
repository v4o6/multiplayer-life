package hackathon2018.multiplayerlife.controller;

import java.io.IOException;
import java.util.List;

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

import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.entities.Player;
import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.service.GameService;

@Controller
public class InputController {
  private static final Logger logger = LoggerFactory.getLogger(InputController.class);

  @Autowired
  private GameService gameService;

  @GetMapping("/input/{playerId}")
  public String input(@PathVariable final long playerId, final Model model) {
    final Player player = gameService.getPlayer(playerId);
    model.addAttribute("player", player);
    final Game game = gameService.getGameByPlayer(playerId);
    model.addAttribute("gameId", game.getId());
    model.addAttribute("statuses", game.getPlayerStatuses());
    return "input";
  }

  @GetMapping("/input/statuses")
  @ResponseBody
  public List<Player.Status> refreshStatuses(@RequestParam("gameId") final long gameId) {
    return gameService.getGame(gameId).getPlayerStatuses();
  }

  @PostMapping("/input/submit")
  @ResponseBody
  public boolean submit(@RequestParam("playerId") final long playerId, @RequestParam("data") final String json) {
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
    gameService.setPlayerState(playerId, state);
    return true;
  }


}
