package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.dominio.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Integer> {

	@Query("SELECT p FROM Producto p")
	public List<Producto> findAllProductos();
}
