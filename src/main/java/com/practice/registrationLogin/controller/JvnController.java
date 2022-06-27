package com.practice.registrationLogin.controller;

import java.util.List;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.practice.registrationLogin.entity.Jvnregistration;
import com.practice.registrationLogin.services.JvnServices;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

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
	
//	@GetMapping("/jnvlogin")
//	public ModelAndView Jvnregistration() {
//		ModelAndView mav = new ModelAndView("Jvnregistration");
//		mav.addObject("user", new Jvnregistration());
//		return mav;
//	}
	
	
//	@PostMapping("/jnvlogin")
//	public String login(@ModelAttribute("jnv") Jvnregistration jnv, ModelMap model) {
//		Jvnregistration user = service.Jvnregistration(jnv.getUsername(), jnv.getPassword());
//		if(Objects.nonNull(user)) {
//			return "welcome";
//		}else {
//			return "jnvpage";
//		}
//		if(jnv.getPassword().equals(user.get().getPassword())) {
//			return "welcome";
//		}else {
//			return "jnvpage";
//	}
		
//		@RequestMapping("/jnvlogin")
//		public String welcomePage(@ModelAttribute("jnv") Jvnregistration jnv ,ModelMap model, @RequestParam long id, @RequestParam String password, @RequestParam String username) {
//			if(username.equals(username) && password.equals(password)) {
//				model.put("id", id);				
//				return "welcome";
//		}else {
//			model.put("msg", "please provide the correct credentials");
//			return "jnvpage";
//		}
//	}	
//	
//	@PostMapping("/jnvlogin")
//	public String loginUser(@ModelAttribute("jnv") Jvnregistration jvnregistration , ModelMap model ) {
//	long id = jvnregistration.getId();
//	
//	Optional<Jvnregistration> userdata = service.findById(id);
//	if(jvnregistration.getPassword().equals(userdata.get().getPassword())) {
//		return "welcome";
//	}else {
//		return "jnvpage";
//	}
//		
//	}
	
//	@RequestMapping("/listalljnv")
//	public String liat() {
//		return "serchResult";
//	}
	
		
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		List<Jvnregistration> jnv = service.getAllJnvregistration();
		System.out.println(jnv);
		model.addAttribute("jnv",jnv );
		return "serchResult";
	}
	
	@RequestMapping("/delete")
	public String deleteJnvregistration(@RequestParam("id") long id, ModelMap model) {
		service.deleteJnvregistrationById(id);
		List<Jvnregistration> jnv = service.getAllJnvregistration();
		model.addAttribute("jnv", jnv);
		System.out.println(jnv);
		return "serchResult";
	}
	
	
	
	@RequestMapping("/update")
	public String updateJnvregistration(@RequestParam("id") long id, ModelMap model) {
		Jvnregistration jvn = service.getJnvregistrationById(id);
		model.addAttribute("Jvn",jvn);
		return "updat_page";
	}
	
	@RequestMapping("/updateData")
	public String updatejnv(@ModelAttribute("jnv") Jvnregistration jnv,ModelMap model) {
		service.save(jnv);
		System.out.println(jnv.getUsername());
		model.addAttribute("msg", "location is updated");
		return "updat_page";
	}
	
	@RequestMapping(value= {"/logout"}, method=RequestMethod.POST)
	public String logoutDb(HttpServletRequest request, HttpServletResponse response) {
		
		return "redirect:/jnvlogin";
	}
	
	
	
	
}
