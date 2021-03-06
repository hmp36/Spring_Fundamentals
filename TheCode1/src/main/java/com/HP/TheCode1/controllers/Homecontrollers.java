package com.HP.TheCode1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Homecontrollers {
	@RequestMapping("")
	public String index(@ModelAttribute("errors") String errors) {
		return "index.jsp";
	}
	@RequestMapping("/process")
    public String errors(@RequestParam(value="field") String field, RedirectAttributes flash){
	 if(field.replaceAll("\\s+$","").toLowerCase().equals("bushido")) {
		 return "code.jsp";
	 }else {
		 flash.addFlashAttribute("errors", "A test errror!");
		 return "redirect:/";
	 }  
  }


}