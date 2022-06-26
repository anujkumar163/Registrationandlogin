package com.practice.registrationLogin.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.registrationLogin.entity.Jvnregistration;
import com.practice.registrationLogin.services.JvnServices;

@Controller
public class JvnController {
	
	@Autowired
	private JvnServices service;
	
	@RequestMapping("/view")
	public String viewJvnPage() {
		return "jnvpage";
	}
	
	@RequestMapping("/savejnv")
	public String savejnv(@ModelAttribute("jnv") Jvnregistration jnv,ModelMap model) {
		service.save(jnv);
		System.out.println(jnv.getCity());
		model.addAttribute("jnv", jnv);
		return "jnvpage";
	}
	
	@GetMapping("/jnvlogin")
	public ModelAndView Jvnregistration() {
		ModelAndView mav = new ModelAndView("Jvnregistration");
		mav.addObject("user", new Jvnregistration());
		return mav;
	}
	
	
	@PostMapping("/jnvlogin")
	public String login(@ModelAttribute("jnv") Jvnregistration jnv, ModelMap model) {
		Jvnregistration user = service.Jvnregistration(jnv.getUsername(), jnv.getPassword());
		System.out.println(user);
		System.out.println(jnv.getUsername());
		System.out.println(jnv.getPassword());
		model.addAttribute("jnv", jnv);
		System.out.println(jnv);
		if(Objects.nonNull(user)) {
			return "welcome";
		}else {
			return "jnvpage";
		}
		
	
	
	}	
	
	@RequestMapping(value= {"/logout"}, method=RequestMethod.POST)
	public String logoutDb(HttpServletRequest request, HttpServletResponse response) {
		
		return "redirect:/jnvlogin";
	}
	
	
	
	
}
