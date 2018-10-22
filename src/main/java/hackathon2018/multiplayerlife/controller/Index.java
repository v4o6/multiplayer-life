package hackathon2018.multiplayerlife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import hackathon2018.multiplayerlife.service.GameService;

@RestController
public class Index {

  @Autowired
  private GameService gameService;




}
