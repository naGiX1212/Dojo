package herencia_polimorfismo;

public class Cuenta {
	private double saldo;
	
	public Cuenta() {
		saldo = 0;
	}
	public void depositar(double saldoDepositar) {
		if(saldoDepositar > 0)
			this.saldo += saldoDepositar;
	}
	public boolean puedoExtraer(double saldo , double saldoExtraer) {
		return saldoExtraer > 0 && saldoExtraer < saldo; 
	}
    public boolean extraer(double saldoExtraer) {
		if(puedoExtraer(saldo,saldoExtraer)) {
			saldo-= saldoExtraer;
			return true;
		}
		return false;
	}
    public void transferir(double monto , Cuenta destino) {
    	if(extraer(monto)) {
    		destino.depositar(monto);
    	}
 
    }
    public double consultarSaldo() {
    	return saldo;
    }
  
    
}
