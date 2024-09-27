package patrones.ej01;

public class Cuadrado implements Component{

	private double lado;
	public Cuadrado(double lado) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return Math.pow(lado, 2);
	}
	
}
