package projet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import projet.entities.User;
import projet.repositories.userRepositorie;

@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private userRepositorie userRepositorie;

	@Autowired

	@RequestMapping(value = "login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "index")
	public String index(Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String login = auth.getName();

		User p = userRepositorie.getUserByLogin(login);
		if (p.getRole().equals("ROLE_ADMIN")) {
			return "redirect:/admin/user/list";
		}else 
		if (p.getRole().equals("ROLE_USER")) {
			return "redirect:/voyageur/profile";
		} else {
			return "redirect:/error";
		}

	}

	@RequestMapping(value = "error")
	public String NotAutho() {
		return "error";
	}

}
