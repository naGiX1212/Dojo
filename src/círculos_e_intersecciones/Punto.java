package círculos_e_intersecciones;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double GetY() {
		return this.y;
	}
	public double GetX() {
		return this.x;
	}
	public static double distanciaEntrePuntos(Punto p1,Punto p2) {
		return Math.hypot(p1.x-p2.x,p1.y-p2.y);
	}
	
}
