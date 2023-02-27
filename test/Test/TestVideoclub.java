package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import Clases.Cliente;
import Clases.Comestible;
import Clases.Libro;
import Clases.Pelicula;
import Clases.Producto;
import Clases.Videoclub;
import Clases.Videojuego;
import Enumeradores.CalificacionAlq;
import Enumeradores.Estado;
import Enumeradores.Genero;
import Enumeradores.TipoDeConsola;
import Interfaces.Alquilable;
import Interfaces.Vendible;

class TestVideoclub {

	@Test
	void queSePuedaCrearUnaPelicula() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final String ACTOR_1_ESPERADO = "Guillermo Francella";
		final String ACTOR_2_ESPERADO = "Emilio Disi";
		
		// Ejecución
		Pelicula pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		pelicula.agregarActor(ACTOR_1_ESPERADO);
		pelicula.agregarActor(ACTOR_2_ESPERADO);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, pelicula.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, pelicula.getDescripcion());
		assertEquals(GENERO_ESPERADO, pelicula.getGenero());
		assertEquals(ANO_DE_ESTRENO_ESPERADO, pelicula.getAnoDeEstreno());
		assertEquals(DIRECTOR_ESPERADO, pelicula.getDirector());
		assertTrue(pelicula.actua(ACTOR_1_ESPERADO));
	}
	
	@Test
	void queSePuedaCrearUnVideojuego() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		
		// Ejecución
		Videojuego juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, juego.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, juego.getDescripcion());
		assertEquals(CONSOLA_ESPERADA, juego.getTipo());
	}
	
	@Test
	void queSePuedaCrearUnLibro() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		
		// Ejecución
		Libro libro = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, libro.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, libro.getDescripcion());
		assertEquals(AUTOR_ESPERADO, libro.getAutor());
		assertEquals(EDITORIAL_ESPERADA, libro.getEditorial());
	}
	
	@Test
	void queSePuedaCrearUnComestible() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Chomps";
		
		// Ejecución
		Comestible comestible = new Comestible(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, comestible.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, comestible.getDescripcion());
	}
	
	@Test
	void queUnaPeliculaSeaVendible() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final Double PRECIO_VENTA = 5000.0;
		
		// Ejecución
		Vendible pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		pelicula.setPrecioVenta(PRECIO_VENTA);
		
		// Validación
		assertEquals(PRECIO_VENTA, pelicula.getPrecioVenta());		
	}

	@Test
	void queUnJuegoSeaAlquilable() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		final Double PRECIO_ALQUILER = 500.0;
		
		// Ejecución
		Alquilable juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		juego.setPrecioAlquiler(PRECIO_ALQUILER);
		
		// Validación
		assertEquals(PRECIO_ALQUILER, juego.getPrecioAlquiler());		
	}

	@Test
	void queSePuedaCrearUnCliente() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Oculto";
		final Integer EDAD_ESPERADA = 23;
		
		// Ejecución
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		// Validación
		assertEquals(CODIGO_ESPERADO, nuevoCliente.getCodigo());
		assertEquals(NOMBRE_ESPERADO, nuevoCliente.getNombre());
		assertEquals(APELLIDO_ESPERADO, nuevoCliente.getApellido());
		assertEquals(EDAD_ESPERADA, nuevoCliente.getEdad());
		
	}

	@Test
	void queSePuedaVenderUnLibro() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.VENDIDO;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		
		video.agregarProducto(nuevoProducto);
		
		// Validación
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
		assertTrue(video.vender(nuevoProducto, nuevoCliente));
		assertEquals(NOMBRE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(CODIGO_CLIENTE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getCodigo());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
	}
	
	@Test
	void queSePuedaAlquilarUnaPelicula() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);		
		((Pelicula) nuevoProducto).agregarActor(ACTOR_1_ESPERADO);
		video.agregarProducto(nuevoProducto);
		
		// Validación
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
		assertTrue(video.alquilar(nuevoProducto, nuevoCliente));
		assertTrue(((Pelicula) nuevoProducto).actua(ACTOR_1_ESPERADO));
		assertEquals(NOMBRE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(CODIGO_CLIENTE_ESPERADO, video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getCodigo());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstadoActual());
	}
	
	@Test
	void queSeNoSePuedaVenderUnComestibleVendido() {
		// Preparación
		final Integer CODIGO_PROD = 1;
		final String DESCRIPCION = "Chomps";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE = 1;
		final String NOMBRE_CLIENTE = "Camila";
		final String APELLIDO_CLIENTE = "Oculto";
		final Integer EDAD_CLIENTE = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.VENDIDO;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto comestible = new Comestible(CODIGO_PROD, DESCRIPCION);
		Cliente nuevoCliente = new Cliente(CODIGO_CLIENTE, APELLIDO_CLIENTE, NOMBRE_CLIENTE, EDAD_CLIENTE);
		video.agregarProducto(comestible);
		
		// Validación
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(comestible).getEstadoActual());
		assertTrue(video.vender(comestible, nuevoCliente));
		assertEquals(comestible.getEstadoActual(), ESTADO_FINAL_ESPERADO);
		assertEquals(video.buscarProducto(comestible).getQuienPoseeElProducto().getApellido(), APELLIDO_CLIENTE);
		assertFalse(video.vender(comestible, nuevoCliente));
	}
	
	@Test
	void queSeNoSePuedaAlquilarUnJuegoAlquilado() {
		
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		final Integer CODIGO_CLIENTE = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Oculto";
		final Integer EDAD_ESPERADA = 23;
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		
		// Ejecución
		Videojuego juego = new Videojuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_CLIENTE, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		video.agregarProducto(juego);

		// Validación
		assertEquals(CODIGO_ESPERADO, juego.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, juego.getDescripcion());
		assertEquals(CONSOLA_ESPERADA, juego.getTipo());
		assertEquals(CODIGO_CLIENTE, nuevoCliente.getCodigo());
		assertEquals(NOMBRE_ESPERADO, nuevoCliente.getNombre());
		assertEquals(APELLIDO_ESPERADO, nuevoCliente.getApellido());
		assertEquals(EDAD_ESPERADA, nuevoCliente.getEdad());
		assertTrue(video.alquilar(juego, nuevoCliente));
		assertFalse(video.alquilar(juego, nuevoCliente));
	}
	
	@Test
	void queLuegoDeDevueltaUnaPeliculaSePuedaAlquilar() {
		// Preparación
		final Integer CODIGO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final String NOMBRE_CLIENTE = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto pelicula = new Pelicula(CODIGO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		Cliente cliente = new Cliente(CODIGO, APELLIDO_ESPERADO, NOMBRE_CLIENTE, EDAD_ESPERADA);		
		((Pelicula) pelicula).agregarActor(ACTOR_1_ESPERADO);
		video.agregarProducto(pelicula);
		
		// Validación
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(pelicula).getEstadoActual());
		assertTrue(video.alquilar(pelicula, cliente));
		assertTrue(((Pelicula) pelicula).actua(ACTOR_1_ESPERADO));
		assertEquals(NOMBRE_CLIENTE, video.buscarProducto(pelicula).getQuienPoseeElProducto().getNombre());
		assertEquals(CODIGO, video.buscarProducto(pelicula).getQuienPoseeElProducto().getCodigo());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(pelicula).getEstadoActual());
		assertTrue(video.devuelvenAlquilado(pelicula, cliente));
		assertTrue(video.alquilar(pelicula, cliente));
	}
	
	@Test
	void queSeNoSePuedaAlquilarUnPeliculaAUnMenor() {
		// Preparación
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 13;
		final Estado ESTADO_ESPERADO = Estado.DISPONIBLE;
		
		// Ejecución
		Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
		Producto pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO, ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);		
		((Pelicula) pelicula).agregarActor(ACTOR_1_ESPERADO);
		((Pelicula) pelicula).setCalificacion(CalificacionAlq.MAYORDE18);
		video.agregarProducto(pelicula);
		
		// Validación
		assertEquals(ESTADO_ESPERADO, video.buscarProducto(pelicula).getEstadoActual());
		assertTrue(((Pelicula) pelicula).actua(ACTOR_1_ESPERADO));
		assertEquals(ESTADO_ESPERADO, video.buscarProducto(pelicula).getEstadoActual());
		assertEquals(null, video.buscarProducto(pelicula).getQuienPoseeElProducto());
		assertFalse(video.alquilar(pelicula, nuevoCliente));
	}
	@Test
	void queSeNoSePuedaAlquilarTresVecesAlMismoTiempo() {
	// Preparación
	final String NOMBRE_VIDEOCLUB = "Blockbuster";
	final Integer CODIGO_CLIENTE = 1;
	final String NOMBRE_ESPERADO = "Camila";
	final String APELLIDO_ESPERADO = "Privado";
	final Integer EDAD_ESPERADA = 23;
	final Integer CODIGO_PELICULA1 = 1;
	final Integer CODIGO_PELICULA2 = 3;
	final Integer CODIGO_JUEGO = 2;
	final String DESCRIPCION_PELICULA = "El Cisne Negro";
	final String DESCRIPCION_PELICULA2 = "Exterminators II";
	final String DESCRIPCION_JUEGO = "Fornite";
	final Genero GENERO_PELICULA1 = Genero.SUSPENSO;
	final Genero GENERO_PELICULA2 = Genero.ACCION;
	final Integer ANO_DE_ESTRENO_PELICULA1 = 2010;
	final Integer ANO_DE_ESTRENO_PELICULA2 = 1993;
	final String DIRECTOR_PELICULA1 = "Darren Aronofsky";
	final String DIRECTOR_PELICULA2 = "Carlos Galettini";
	final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
	final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
	final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;

	// Ejecución
	Videoclub video = new Videoclub(NOMBRE_VIDEOCLUB);
	Pelicula pelicula = new Pelicula(CODIGO_PELICULA1, DESCRIPCION_PELICULA, GENERO_PELICULA1, ANO_DE_ESTRENO_PELICULA1, DIRECTOR_PELICULA1);
	Pelicula pelicula2 = new Pelicula(CODIGO_PELICULA2, DESCRIPCION_PELICULA2, GENERO_PELICULA2, ANO_DE_ESTRENO_PELICULA2, DIRECTOR_PELICULA2);
	Videojuego juego = new Videojuego(CODIGO_JUEGO, DESCRIPCION_JUEGO, CONSOLA_ESPERADA);
	Cliente cliente = new Cliente(CODIGO_CLIENTE, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);	
	
	video.agregarProducto(juego);
	video.agregarProducto(pelicula);
	video.agregarProducto(pelicula2);
	
	// Validación
	assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(pelicula).getEstadoActual());
	assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(juego).getEstadoActual());
	assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(pelicula2).getEstadoActual());
	
	assertTrue(video.alquilar(pelicula, cliente));
	assertTrue(video.alquilar(juego, cliente));
	assertFalse(video.alquilar(pelicula2, cliente));
	
	assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(pelicula).getEstadoActual());
	assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(pelicula2).getEstadoActual());
	assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(juego).getEstadoActual());
	}
}
