package com.registerform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.registerform.bean.User;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		User user = new User();
		model.addAttribute("USER", user);
		return "registration";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@ModelAttribute(value = "USER") User user,
			BindingResult result) {
		if (result.hasErrors()) {
			return "registration";
		} else {
			System.out.println("User values is : " + user);
			return "success";
		}
	}
}