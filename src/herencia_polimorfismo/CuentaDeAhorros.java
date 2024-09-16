package herencia_polimorfismo;

public class CuentaDeAhorros extends Cuenta{
	private double montoReservado = 0;
	
	  public void reservarSaldo(double monto) {
	    	if(extraer(monto)) {
	    		this.montoReservado+= monto;
	    		extraer(monto);
	    	}
	    }
	    public void reintegro() {
	    	depositar(montoReservado);
	    	montoReservado = 0;
	    }
}
