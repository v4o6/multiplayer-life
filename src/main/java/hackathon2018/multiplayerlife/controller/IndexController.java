package hackathon2018.multiplayerlife.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import hackathon2018.multiplayerlife.entities.Player;
import hackathon2018.multiplayerlife.entities.command.PlayerForm;
import hackathon2018.multiplayerlife.service.GameService;

@Controller
@RequestMapping("/")
public class IndexController {

  @Autowired
  private GameService gameService;

	@GetMapping("/")
	public String index(final PlayerForm playerForm) {
		return "index";
	}



  @PostMapping("/join")
 	public ModelAndView join(final PlayerForm playerForm, final BindingResult result,
													 final RedirectAttributes redirect) {
 		if (result.hasErrors()) {
 			return new ModelAndView("/", "formErrors", result.getAllErrors());
 		}

 		final Player player = gameService.registerPlayer(playerForm.getName());
 		redirect.addFlashAttribute("globalMessage", "Joining a Game...");

 		return new ModelAndView("redirect:/input/{player.id}", "player.id", player.getId());
 	}

}
