package hackathon2018.multiplayerlife.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.entities.Player;
import hackathon2018.multiplayerlife.entities.Game;
import hackathon2018.multiplayerlife.service.GameService;

@Controller
public class InputController {

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
  public boolean submit(@RequestParam("playerId") final long playerId, @RequestParam("data") final boolean[][] data) {
    // TODO myron

    final LifeState state = new LifeState(new boolean[0][0]);
    // TODO kenny
    return true;
  }


}
