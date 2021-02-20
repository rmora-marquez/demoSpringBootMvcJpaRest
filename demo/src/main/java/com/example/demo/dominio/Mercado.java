package com.example.demo.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the mercados database table.
 * 
 */
@Entity
@Table(name="mercados")
@NamedQuery(name="Mercado.findAll", query="SELECT m FROM Mercado m")
public class Mercado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String ubicacion;

	//bi-directional many-to-many association to Producto
	@ManyToMany
	@JoinTable(
		name="mercadoproducto"
		, joinColumns={
			@JoinColumn(name="idMercado")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idProducto")
			}
		)
	private List<Producto> productos;

	public Mercado() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}