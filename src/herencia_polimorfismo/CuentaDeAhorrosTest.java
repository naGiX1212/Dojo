package herencia_polimorfismo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaDeAhorrosTest {

	@Test
	void reservarSaldoTest() {
		CuentaDeAhorros c = new CuentaDeAhorros();
		c.depositar(10);
		c.reservarSaldo(5);
		assertEquals(5,c.consultarSaldo());
	}
	void reintegroTest() {
		CuentaDeAhorros c = new CuentaDeAhorros();
		c.depositar(10);
		c.reservarSaldo(3);
		assertEquals(7,c.consultarSaldo());
		c.reintegro();
		assertEquals(10,c.consultarSaldo());
	}

}
