package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/ejemplopost")
public class PostController {

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("persona", new Persona());
		return "formulario";
	}

	@PostMapping("/addpersona")
	public ModelAndView resultados(@ModelAttribute("persona") Persona persona) {
		ModelAndView mav = new ModelAndView("resultados");
		mav.addObject("persona", persona);
		return mav;
	}

}
