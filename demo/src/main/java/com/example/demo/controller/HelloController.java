package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bss.IProductoService;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	private IProductoService prodBo;
	
	@GetMapping(path="/")
	public String index(Model modelo) {		
		return "index";
	}

	@GetMapping(path = "/hello")
	public String showHello(Model modelo) {
		modelo.addAttribute("saludos", "Primera app Spring boot");
		return "helloView";
	}
	
	@GetMapping(path = "/producto")
	public String showProductos(Model modelo) {
		modelo.addAttribute("productos", prodBo.findAll());
		return "productoView";
	}
		
}
