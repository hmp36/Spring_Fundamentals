package com.HP.login_reg.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HP.login_reg.models.User;

@Controller
public class UserController{
	@RequestMapping("/")
	public String root() {
	return "redirect:/registration";	
	}
	
    @RequestMapping("/registration")
    public String register(@Valid @ModelAttribute("user") User user) {
        return "register";
    }
    
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}	