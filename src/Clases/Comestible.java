package Clases;

import Interfaces.Vendible;

public class Comestible extends Producto implements Vendible{

	private Double precioVenta;

	public Comestible(Integer cod, String descr) {
		super(cod, descr);
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
