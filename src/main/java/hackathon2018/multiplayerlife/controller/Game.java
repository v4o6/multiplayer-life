package hackathon2018.multiplayerlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hackathon2018.multiplayerlife.entities.LifeState;
import hackathon2018.multiplayerlife.service.GameService;

@RestController
public class Game {

  @Autowired
  private GameService gameService;

  @GetMapping("/game/state")
  @ModelAttribute("gameState")
  public LifeState getState(@RequestParam("gameId") final long gameId) {
    // TODO
    return null;
  }

}
