package Clases;

import Enumeradores.Estado;

public abstract class Producto {
	private Integer codigo;
	private String descripcion;
	private Estado estado;
	private Cliente quienPoseeElProducto;

	public Producto(Integer codigo, String descripcion) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.estado=Estado.DISPONIBLE;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Estado getEstadoActual() {
		return this.estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Cliente getQuienPoseeElProducto() {
		return quienPoseeElProducto;
	}

	public void setQuienPoseeElProducto(Cliente clienteCompra) {
		this.quienPoseeElProducto=clienteCompra;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
}
