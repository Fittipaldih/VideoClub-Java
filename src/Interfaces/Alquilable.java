package Interfaces;

import Enumeradores.CalificacionAlq;

public interface Alquilable {
		
	void setPrecioAlquiler(Double pRECIO_ALQUILER);

	Double getPrecioAlquiler();
	
	CalificacionAlq getCalificacion();

	void setCalificacion(CalificacionAlq calificacion);

}
