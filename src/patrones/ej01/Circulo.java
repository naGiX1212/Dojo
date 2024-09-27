package patrones.ej01;

public class Circulo implements Component {

	private double r;
	public Circulo(double r) {
		this.r = r;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(r, 2);
	}

}
