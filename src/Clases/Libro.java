package Clases;

import Interfaces.Vendible;

public class Libro extends Producto implements Vendible {

	private Integer codigo;
	private String descripcion;
	private String autor;
	private String editorial;
	private Double precioVenta;

	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		this.autor=autor;
		this.editorial=editorial;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", descripcion=" + descripcion + ", autor=" + autor + ", editorial="
				+ editorial + "]";
	}

	@Override
	public void setPrecioVenta(Double precio) {
		this.precioVenta=precio;
	}

	@Override
	public Double getPrecioVenta() {
		return this.precioVenta;
	}
}
