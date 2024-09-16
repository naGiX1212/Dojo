package círculos_e_intersecciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class CirculoTest {

	@Test
	void Interseccion1() {
		Circulo c1 = new Circulo(new Punto(219, 308), 50.83);
		Circulo c2 = new Circulo(new Punto(281,218), 58.68);
		assertTrue(c1.interseccionDeCirculos(c2));// true
	}
	void Interseccion2() {
		Circulo c1 = new Circulo(new Punto(556.64,370.78),99.83);
		Circulo c2 = new Circulo(new Punto(448.05,246.4),65.4);
		assertTrue(c1.interseccionDeCirculos(c2));// true
	}
	void Interseccion3() {
		Circulo c1 = new Circulo(new Punto(181.64,332.78),99.83);
		Circulo c2 = new Circulo(new Punto(365.05,381.4),65.4);
		assertFalse(c1.interseccionDeCirculos(c2));// false
	}
	void Interseccion4() {
		Circulo c1 = new Circulo(new Punto(554.64,372.78),99.83);
		Circulo c2 = new Circulo(new Punto(448.05,246.4),65.4);
		assertFalse(c1.interseccionDeCirculos(c2));// false
	
	}

	
}
