package com.HP.login_reg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.HP.login_reg.models.User;

@Controller
public class UserController{
	@RequestMapping("/")
	public String root() {
	return "redirect:/registration";	
	}
	
    @RequestMapping("/registration")
    public String register(@Valid @ModelAttribute("user") User user, Model model) {
        return "register";
    
    }
    @PostMapping("/registration")
    public String register(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "register";
        }
    }
    @RequestMapping("/dashboard")
    public String dashboard(Model model) {
    	model.addAttribute(string)
        return "dashboard";
    }    
    @RequestMapping("/login")
    public String login(Principal principal, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
        String username = principal.getName();
        User currentUser = userService.findByEmail(username);
        if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successful!");
        }
        if(currentUser.users_roles = "ROLE_ADMIN"){
            return "redirect:/admin";
        }
        return "loginPage";
    }
    @RequestMapping(value = {"/", "/home"})
    public String home(Principal principal, Model model) {
        String email = principal.getName();
        model.addAttribute("currentUser", userService.findByEmail(email));
        return "homePage";
    
    
    
    @RequestMapping("/logout")
    public String logout(HttpSession s){
    s.setAttribute("id",null);
    return "register";
    	      
        
    }
}	

