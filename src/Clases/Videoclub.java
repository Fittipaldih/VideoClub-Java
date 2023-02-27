package Clases;

import java.util.HashSet;
import java.util.Set;

import Enumeradores.Estado;
import Interfaces.Alquilable;
import Interfaces.Vendible;

public class Videoclub {

	private String nombre;
	private Set <Producto> productos;

	public Videoclub(String nombre) {
		this.nombre=nombre;
		productos=new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Videoclub [nombre=" + nombre + "]";
	}

	public void agregarProducto(Producto nuevoProducto) {
		productos.add(nuevoProducto);
	}

	public Producto buscarProducto(Producto productoBuscado) {
		Producto retorno=null;
		for (Producto producto : productos) {
			if (producto.equals(productoBuscado)) {
				retorno= producto;
			}
		}
		return retorno;
	}

	public Boolean vender(Producto productoAVender, Cliente clienteCompra) {
		boolean retorno=false;
			if ( buscarProducto(productoAVender)!=null && productoAVender.getEstadoActual().equals(Estado.DISPONIBLE)
					&& productoAVender.getQuienPoseeElProducto()==null && productoAVender instanceof Vendible) {
				productoAVender.setEstado(Estado.VENDIDO);
				productoAVender.setQuienPoseeElProducto(clienteCompra);
				retorno = true;
		} return retorno;
	}
	
	public Boolean alquilar(Producto productoAAlquilar, Cliente clienteAlquila) {
		boolean retorno=false;
		if ( clienteAlquila.esMayorQueCalificacion(productoAAlquilar) && clienteAlquila.puedeAlquilar() && buscarProducto(productoAAlquilar)!=null && productoAAlquilar.getEstadoActual().equals(Estado.DISPONIBLE)
				&& productoAAlquilar.getQuienPoseeElProducto()==null && productoAAlquilar instanceof Alquilable) {
			
			productoAAlquilar.setEstado(Estado.ALQUILADO);
			productoAAlquilar.setQuienPoseeElProducto(clienteAlquila);
			clienteAlquila.sumarAlquiler();
			retorno = true;
		} return retorno;
	}
	
	public Boolean devuelvenAlquilado(Producto productoDevuelta, Cliente clienteDevuelve) {
		boolean retorno=false;
		if ( buscarProducto(productoDevuelta).getQuienPoseeElProducto().equals(clienteDevuelve) && productoDevuelta.getEstadoActual().equals(Estado.ALQUILADO)) {
			productoDevuelta.setEstado(Estado.DISPONIBLE);
			productoDevuelta.setQuienPoseeElProducto(null);
			clienteDevuelve.restaAlquiler();
			retorno = true;
		}
	 return retorno;
	}
}
