package hackathon2018.multiplayerlife.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hackathon2018.multiplayerlife.entities.Player;
import hackathon2018.multiplayerlife.service.GameService;

@RestController
public class Input {

  @Autowired
  private GameService gameService;

  @GetMapping("/input/player")
  @ModelAttribute("player")
  public Player getPlayer(@RequestParam("playerId") final long playerId) {
    return gameService.getPlayer(playerId);
  }

  @GetMapping("/input/statuses")
  @ModelAttribute("playerStatuses")
  public List<PlayerStatus> getPlayerStatuses(@RequestParam("gameId") final long gameId) {
    List<PlayerStatus> statusList = new ArrayList<PlayerStatus>();
    for (Player player : gameService.getGame(gameId).getPlayers()) {
      statusList.add(new PlayerStatus(player));
    }
    return statusList;
  }

  @PostMapping("/input/submit")
  public boolean submit(@RequestParam("playerId") final long playerId, @RequestParam("data") final String json) {
    // TODO
    int test = 1;
    return true;
  }

  public static class PlayerStatus {
    private final long id;
    private final String name;
    private final boolean ready;

    private PlayerStatus(final Player player) {
      id = player.getId();
      name = player.getName();
      ready = player.getState() != null;
    }

    public long getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public boolean isReady() {
      return ready;
    }
  }

}
