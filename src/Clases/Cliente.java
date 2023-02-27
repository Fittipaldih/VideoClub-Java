package Clases;
import Enumeradores.CalificacionAlq;
import Interfaces.Alquilable;

public class Cliente {
 
	private Integer codigo;
	private String apellido;
	private String nombre;
	private Integer edad;
	private Integer cantidadDeAlquileresAlMismoTiempo;

	public Cliente(Integer cod, String ape, String nom, Integer ed) {
		this.codigo=cod;
		this.apellido=ape;
		this.nombre=nom;
		this.edad=ed;
		this.cantidadDeAlquileresAlMismoTiempo=0;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void sumarAlquiler() {
		this.cantidadDeAlquileresAlMismoTiempo++;
	}
	
	public void restaAlquiler() {
		this.cantidadDeAlquileresAlMismoTiempo--;
	}
	
	public Boolean puedeAlquilar() {
		if ( this.cantidadDeAlquileresAlMismoTiempo<2) {
			return true;
		}
		return false;
	}
	public boolean esMayorQueCalificacion(Producto producto) {
	CalificacionAlq calificacion = ((Alquilable) producto).getCalificacion();
	Integer edadCalificacion=null;
	Boolean retorno = false;
	
		switch(calificacion) {
			case TODO_PUBLICO:
				edadCalificacion = 0;			
				break;
			case MAYORDE7:
				edadCalificacion = 7;
				break;
			case MAYORDE18:
				edadCalificacion = 18;
				break;
		}
		
		if (this.getEdad() >= edadCalificacion) {
			retorno = true;
		}
		return retorno;
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
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
