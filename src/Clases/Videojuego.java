package Clases;

import Enumeradores.CalificacionAlq;
import Enumeradores.TipoDeConsola;
import Interfaces.Alquilable;

public class Videojuego extends Producto implements Alquilable {

	private Integer codigo;
	private TipoDeConsola consola;
	private String descripcion;
	private Double precioAlq;
	private CalificacionAlq calificacion;

	public Videojuego(Integer codigo, String descripcion, TipoDeConsola consola) {
		super(codigo, descripcion);
		this.consola=consola;
		calificacion=CalificacionAlq.TODO_PUBLICO; // es por defecto al menos que se indique lo contrario
	}

	public TipoDeConsola getTipo() {
		return consola;
	}

	@Override
	public String toString() {
		return "Videojuego [codigo=" + codigo + ", consola=" + consola + ", descripcion=" + descripcion + "]";
	}

	@Override
	public void setPrecioAlquiler(Double precio) {
		this.precioAlq=precio;
	}

	@Override
	public Double getPrecioAlquiler() {
		return this.precioAlq;
	}

	@Override
	public void setCalificacion(CalificacionAlq calificacion) {
		this.calificacion=calificacion;
	}

	@Override
	public CalificacionAlq getCalificacion() {
		return this.calificacion;
	}
}
