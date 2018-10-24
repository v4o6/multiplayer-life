package hackathon2018.multiplayerlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import hackathon2018.multiplayerlife.entities.Result;
import hackathon2018.multiplayerlife.service.GameService;

@Controller
public class ResultController {

  @Autowired
  private GameService gameService;

  @GetMapping("/result/{gameId}")
  public String result(@PathVariable final long gameId, final Model model) {
    Result gameResult = gameService.getGameResult(gameId);
    model.addAttribute("result", gameResult);
    model.addAttribute("winner", gameResult.getWinner());
    return "result";
  }

}
