package com.example.demo.bss;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dominio.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
@Transactional
public class ProductoServiceImp implements IProductoService {
	@Autowired
	private ProductoRepository prodDao;
	
	
	public ProductoServiceImp() {
		System.out.println("smoooth producto service");
	}

	@Override	
	public List<Producto> findAll() {
		return prodDao.findAllProductos();
	}

}
