package hackathon2018.multiplayerlife.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Views {
  private static final Logger logger = LoggerFactory.getLogger(Views.class);

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/input/{userId}")
  public String input(@PathVariable Long userId) {
    // TODO
    return "input";
  }

  @GetMapping("/game/{gameId}")
  public String game(@PathVariable Long gameId) {
    // TODO
    return "game";
  }

}
