package edu.poly.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.poly.model.user;
import edu.poly.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String add(ModelMap model) {
		model.addAttribute("USER", new user());
		model.addAttribute("ACTION", "saveOrUpdate");
		List<user> list = (List<user>) userService.findAll();
		model.addAttribute("users", list);
		return "user";
	}
	@PostMapping("/saveOrUpdate")
	public String saveOrUpdate(ModelMap model, @ModelAttribute("USER") user user) {
		userService.save(user);
		List<user> list = (List<user>) userService.findAll();
		model.addAttribute("users", list);
		return add(model);
	}
//	@RequestMapping("/list")
//	public String list(ModelMap model) {
//		List<user> list = (List<user>) userService.findAll();
//		model.addAttribute("users", list);
//		return "list-user";
//	}
	@RequestMapping("/edit/{id}")
	public String edit(ModelMap model, @PathVariable(name = "id") String id) {
		Optional<user> optDepart = userService.findById(id);
		List<user> list = (List<user>) userService.findAll();
		model.addAttribute("users", list);
		if (optDepart.isPresent()) {
			model.addAttribute("USER", optDepart.get());
		}else {
			model.addAttribute("USER", new user());
//			return list(model);
		}
		model.addAttribute("ACTION", "/users/saveOrUpdate");
		return "user";
	}
	@GetMapping("/delete/{id}")
	public String delete(ModelMap model, @PathVariable(name = "id") String id) {
		userService.deleteById(id);
		List<user> list = (List<user>) userService.findAll();
		model.addAttribute("users", list);
		return add(model);
	}
	
//	@RequestMapping("/find")
//	public String find(ModelMap model, @RequestParam(defaultValue = "") String name) {
//		List<user> list = userService.findByName(name);
//		model.addAttribute("users", list);
//		return "user";
//	}
}
