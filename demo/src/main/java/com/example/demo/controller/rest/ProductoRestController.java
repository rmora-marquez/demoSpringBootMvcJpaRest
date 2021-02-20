package com.example.demo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bss.IProductoService;
import com.example.demo.dominio.Producto;

@RestController
@RequestMapping(path="/api/v1/producto")
public class ProductoRestController {
	@Autowired
	private IProductoService proBo;
	
	public ProductoRestController() {}
	
	@GetMapping	
	public ResponseEntity<List<Producto>> getProductos(){ 
		return new ResponseEntity<List<Producto>>(proBo.findAll(), HttpStatus.OK);
	}

}
