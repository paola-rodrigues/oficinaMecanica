package br.com.oficina.oficinamecanica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
