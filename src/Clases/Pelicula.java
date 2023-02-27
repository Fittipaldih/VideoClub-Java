package Clases;

import java.util.ArrayList;
import java.util.List;

import Enumeradores.CalificacionAlq;
import Enumeradores.Genero;
import Interfaces.Alquilable;
import Interfaces.Vendible;

public class Pelicula extends Producto implements Vendible, Alquilable {

	private Integer codigo;
	private String descripcion;
	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	private List <String> actores;
	private Double precioVenta, precioAlquiler;
	private CalificacionAlq calificacion;
	
	public Pelicula(Integer codigo, String descripcion, Genero genero, Integer anoDeEstreno, String director) {
		super(codigo, descripcion);
		this.genero=genero;
		this.anoDeEstreno=anoDeEstreno;
		this.director=director;
		calificacion=CalificacionAlq.TODO_PUBLICO; // es por defecto al menos que se indique lo contrario
		actores=new ArrayList<>();
	}
	
	public void agregarActor(String actor) {
		actores.add(actor);
	}

	public Genero getGenero() {
		return genero;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public String getDirector() {
		return director;
	}

	public Boolean actua(String actorBuscado) {
		boolean retorno=false;
		
		for (String actor : actores) {
			if ( actor.equals(actorBuscado)) {
				retorno= true;
			}
		}
		return retorno;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", descripcion=" + descripcion + ", genero=" + genero + ", anoDeEstreno="
				+ anoDeEstreno + ", director=" + director + ", actores=" + actores + "]";
	}

	@Override
	public void setPrecioVenta(Double precio) {
		this.precioVenta=precio;
	}

	@Override
	public Double getPrecioVenta() {
		return precioVenta;
	}

	@Override
	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler=precioAlquiler;
	}

	@Override
	public Double getPrecioAlquiler() {
		return this.precioAlquiler;
	}

	@Override
	public CalificacionAlq getCalificacion() {
		return this.calificacion;
	}

	@Override
	public void setCalificacion(CalificacionAlq calificacion) {
		this.calificacion=calificacion;
	}
}
