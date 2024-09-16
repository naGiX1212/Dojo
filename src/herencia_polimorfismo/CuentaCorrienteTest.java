package herencia_polimorfismo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaCorrienteTest {

	@Test
	void ExtraerTodoTest() {
		CuentaCorriente c = new CuentaCorriente(100);
		c.ExtraerTodo();
		assertEquals(0, c.consultarSaldo());
	}
	void extraer0(){
		CuentaCorriente c = new CuentaCorriente(500);	
		assertTrue(c.extraer(450));
	}
	void extraer1(){
		CuentaCorriente c = new CuentaCorriente(100);	
		assertTrue(c.extraer(50));
	}
	void extraer3(){
		CuentaCorriente c = new CuentaCorriente(100);	
		c.depositar(100);
		assertTrue(c.extraer(101));
	}
	void extraer4(){
		CuentaCorriente c = new CuentaCorriente(100);	
		c.depositar(100);
		assertTrue(c.extraer(200));
	}
	void extraer5(){
		CuentaCorriente c = new CuentaCorriente(100);	
		c.depositar(100);
		assertFalse(c.extraer(201));
	}
}
