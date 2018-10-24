package hackathon2018.multiplayerlife.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.entities.Player;
import hackathon2018.multiplayerlife.entities.Result;
import hackathon2018.multiplayerlife.service.GameService;

@Controller
public class ResultController {
  private static final Logger logger = LoggerFactory.getLogger(ResultController.class);

  @Autowired
  private GameService gameService;

  @GetMapping("/result/{gameId}")
  public String result(@PathVariable final long gameId, final Model model) {
    final Result result = gameService.getGameResult(gameId);
    model.addAttribute("results", result.getResults());
    model.addAttribute("winner", result.getWinner());
    model.addAttribute("gameSize", gameService.getGameSize());
    model.addAttribute("playerSize", gameService.getPlayerSize());
    return "result";
  }

  @GetMapping("/result/gamedata")
  @ResponseBody
  public LifeState getGameData(@RequestParam("gameId") final long gameId) {
    return gameService.getGameResult(gameId).getState();
  }

  @GetMapping("/result/playerdata")
  @ResponseBody
  public LifeState getPlayerData(@RequestParam("playerId") final long playerId) {
    return gameService.getPlayer(playerId).getState();
  }

}
