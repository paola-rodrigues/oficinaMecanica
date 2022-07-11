package br.com.oficina.oficinamecanica.controllers;

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.oficina.oficinamecanica.models.ClienteModel;

@Controller
public class ClienteController {
	
	@GetMapping("/cliente/cadastrar")
	public String cadastrar(Model model) {
		model.addAttribute("cliente", new ClienteModel());
		return "cliente/cadastrar";
	
	

		}

}
