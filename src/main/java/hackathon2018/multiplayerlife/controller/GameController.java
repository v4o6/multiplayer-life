package hackathon2018.multiplayerlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.entities.LifeState;
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

  @PostMapping("/game/submit")
  @ResponseBody
  public boolean submit(@RequestParam("playerId") final long playerId, @RequestParam("data") final boolean[][] data) {
    // TODO myron

    final LifeState state = new LifeState(new boolean[0][0]);
    // TODO kenny

    return true;
  }

}
