package patrones.ej01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component c = new Composite(
				new Cuadrado("Rojo",10),
				new Cuadrado("Verde",15),
				new Composite(
						new Cuadrado("Rosa",25)
						)
				);
		System.out.println(((Composite) c).getCantTemperas());
	}

}
