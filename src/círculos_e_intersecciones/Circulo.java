package círculos_e_intersecciones;

public class Circulo {
	private double radio;
	private Punto puntoCentral;
	public Circulo(Punto p,double radio) {
		if(radio > 0) {
			this.radio = radio;
			puntoCentral = new Punto(p.GetX(),p.GetY());
		}
		
	}
	public  boolean interseccionDeCirculos(Circulo c2) {
		return ((this.radio + c2.radio) > Punto.distanciaEntrePuntos(
				this.puntoCentral,c2.puntoCentral)
				);
	}
}
