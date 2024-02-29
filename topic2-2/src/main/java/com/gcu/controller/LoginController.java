package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gcu.model.LoginModel;

@Controller
@RequestMapping("/login")
public class LoginController {
	/**
	 * Simple Hello World Controller that returns a String in the response body.
	 * Invoke using /test1 URI.
	 * 
	 * @return Hello World test string
	 */
	@GetMapping("/")
	@ResponseBody
	public String display(Model model)
	{
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
}
