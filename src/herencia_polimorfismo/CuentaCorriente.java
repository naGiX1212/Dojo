package herencia_polimorfismo;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente(double descubierto) {
		if(descubierto > 0)
			this.descubierto = descubierto;
		else
			descubierto = 0;
	}
	public void ExtraerTodo() {
		extraer(consultarSaldo());
	}
	@Override
	 public boolean extraer(double saldoExtraer) {
			if(puedoExtraer(consultarSaldo(),saldoExtraer)) {
				return super.extraer(saldoExtraer);
			}
			else if(descubierto > 0 && puedoExtraer(consultarSaldo()+descubierto,saldoExtraer)) {
				descubierto -= saldoExtraer - consultarSaldo();
				ExtraerTodo();
			}
			return false;
		}
}
