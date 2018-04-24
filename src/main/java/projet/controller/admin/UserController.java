package projet.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import projet.entities.User;
import projet.repositories.userRepositorie;

@Controller
@RequestMapping("admin/user")

public class UserController {

	@Autowired
	private userRepositorie userRepositorie;

	@RequestMapping(value = "list")
	public String list(Model model, HttpServletResponse response) {
		List<User> listUser = userRepositorie.findAll();
		model.addAttribute("listUser", listUser);
		return "user/Admin_list";
	}

	/**
	 * Redirection to form User
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("form")
	public ModelAndView newContact(ModelAndView model) {
		model.addObject("page", "user/Admin_add");
		model.setViewName("user/Admin_add");
		return model;
	}

	/**
	 * Adding New User
	 * 
	 * @param user
	 * @retur
	 */
	@RequestMapping(value = "addUser", method = RequestMethod.POST)
	public String add(@ModelAttribute User user) {
		user.setRole("ROLE_USER");
		userRepositorie.save(user);
		return "redirect:/admin/user/list";

	}

	/**
	 * Delete User
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public String remove(@RequestParam(name = "id") Long id) {
		userRepositorie.delete(id);
		return "redirect:/admin/user/list";
	}

	/**
	 * Redirection to editUser Form
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public String edit(Model model, @RequestParam(name = "id") Long id) {

		User user = userRepositorie.findOne(id);
		model.addAttribute("user", user);
		return "user/Admin_edit";
	}

	/**
	 * Redirection to detailUser Form
	 * 
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/detailUser", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam(name = "id") Long id) {
		System.out.println("test");
		User user = userRepositorie.findOne(id);
		model.addAttribute("user", user);
		return "user/Admin_detail";
	}

}
