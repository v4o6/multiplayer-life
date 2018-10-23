package hackathon2018.multiplayerlife.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ResultController {

  @GetMapping("/result/{gameId}")
  public String result(@PathVariable final long gameId, final Model model) {
    // TODO kenny
    // save player results and winner into model; see InputController.input()
    return "result";
  }

}
