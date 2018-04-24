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

import projet.entities.Bus;
import projet.repositories.BusRepositorie;

@Controller
@RequestMapping("admin/bus")
public class BusController {
	@Autowired
	private BusRepositorie busRepositorie;

	@RequestMapping(value = "list")
	public String list(Model model, HttpServletResponse response) {
		List<Bus> listBus = busRepositorie.findAll();
		model.addAttribute("listBus", listBus);
		return "bus/list";
	}

	/**
	 * Redirection to form Bus
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("form")
	public ModelAndView newContact(ModelAndView model) {
		model.addObject("page", "bus/add");
		model.setViewName("bus/add");
		return model;
	}

	/**
	 * Adding New Bus
	 * 
	 * @param bus
	 * @retur
	 */
	@RequestMapping(value = "addBus", method = RequestMethod.POST)
	public String add(@ModelAttribute Bus bus) {
		busRepositorie.save(bus);
		return "redirect:/admin/bus/list";

	}

	/**
	 * Delete Bus
	 * 
	 * @param num_serie
	 * @return
	 */
	@RequestMapping(value = "/deleteBus", method = RequestMethod.GET)
	public String remove(@RequestParam(name = "num_serie") Long num_serie) {
		busRepositorie.delete(num_serie);
		return "redirect:/admin/bus/list";
	}

	/**
	 * Redirection to editBus Form
	 * 
	 * @param model
	 * @param num_serie
	 * @return
	 */
	@RequestMapping(value = "/editBus", method = RequestMethod.GET)
	public String edit(Model model, @RequestParam(name = "id") Long num_serie) {

		Bus bus = busRepositorie.findOne(num_serie);
		model.addAttribute("bus", bus);
		return "bus/edit";
	}

	/**
	 * Redirection to detailBus Form
	 * 
	 * @param model
	 * @param num_serie
	 * @return
	 */
	@RequestMapping(value = "/detailBus", method = RequestMethod.GET)
	public String detail(Model model, @RequestParam(name = "num_serie") Long num_serie) {
		System.out.println("test");
		Bus bus = busRepositorie.findOne(num_serie);
		model.addAttribute("bus", bus);
		return "bus/detail";
	}

}
