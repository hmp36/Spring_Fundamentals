package com.HP.HelloHuman.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping("")
	public String index(
			@RequestParam(value="first",defaultValue="Human") String first,
			@RequestParam(value="last",defaultValue="") String last,Model model){
		model.addAttribute("first",first);
		model.addAttribute("last",last);
		return "index.jsp";
	}
	
//	@RequestMapping("/sammy")
//	public String sammy() {
//		return "sammy.jsp";
	// ...
    @RequestMapping("/{name}")
    public String name(@PathVariable(value="name") String name,Model model) {
          model.addAttribute("name",name);
          return "any.jsp";
    }
// ...




}

