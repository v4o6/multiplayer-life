package hackathon2018.multiplayerlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.service.GameService;

@Controller
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping("/game/{gameId}")
  public String game(@PathVariable final long gameId, final Model model) {
    model.addAttribute("gameId", gameId);
    final Game game = gameService.getGame(gameId);
    model.addAttribute("lifeState", game.getState());
    model.addAttribute("statuses", game.getPlayerStatuses());
    return "game";
  }

}
