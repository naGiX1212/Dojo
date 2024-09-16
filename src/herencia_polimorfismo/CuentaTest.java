package herencia_polimorfismo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest {
	@Test
	void constultarSaldoTest() {
		Cuenta c = new Cuenta();
		assertEquals(0, c.consultarSaldo());
	}
	@Test
	void depositarTest() {
		Cuenta c = new Cuenta();
		c.depositar(500);
		assertEquals(500,c.consultarSaldo());
	}
	
	@Test
	
	void extraerTest() {
		Cuenta c = new Cuenta();
		c.depositar(50);
		assertTrue(c.extraer(25));
		assertEquals(25,c.consultarSaldo());
	}
	@Test
	void puedoExtraerTest() {
		Cuenta c = new Cuenta();
		assertFalse(c.puedoExtraer(100,150));
	}
	@Test
	void transferirTest() {
		Cuenta orig = new Cuenta();
		Cuenta dest = new Cuenta();
		orig.depositar(50);
		orig.transferir(25, dest);
		assertEquals(25,orig.consultarSaldo());
		assertEquals(25,dest.consultarSaldo());
	}
	
}
