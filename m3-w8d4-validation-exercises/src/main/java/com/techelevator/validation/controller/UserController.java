package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	
	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String getRegistrationForm(ModelMap modelHolder) {
		if( ! modelHolder.containsAttribute("registration")) {
			modelHolder.put("registration", new Registration());
		}
		return "registration";
	}

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String processRegistration(@Valid @ModelAttribute Registration regData, 
			BindingResult result, RedirectAttributes flash) {
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "registration", result);
			flash.addFlashAttribute("registration", regData);
			return"redirect:/register";
		}
		
		flash.addFlashAttribute("message", "You are registered!");
		return "redirect:/";
	}

	// GET: /login
	// Return the empty login view
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getLoginForm(ModelMap modelHolder) {
		if( ! modelHolder.containsAttribute("login")) {
			modelHolder.put("login", new Login());
		}
		return "login";
	}

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String processLogin(@Valid @ModelAttribute Login logData, BindingResult result, 
			RedirectAttributes flash) {
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);
			flash.addFlashAttribute("login", logData);
			return"redirect:/login";
		}
		flash.addFlashAttribute("message", "You are Logged in!");
		return "redirect:/";
	}

	// GET: /confirmation
	// Return the confirmation view
}
