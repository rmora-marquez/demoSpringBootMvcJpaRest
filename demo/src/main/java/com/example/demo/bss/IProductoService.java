package com.example.demo.bss;

import java.util.List;

import com.example.demo.dominio.Producto;

public interface IProductoService {
	
	List<Producto> findAll();
}
