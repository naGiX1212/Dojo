package patrones.ej01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component c = new Composite(
				new Cuadrado(2),
				new Cuadrado(5),
				new Composite(
						new Cuadrado(1)
						)
				
				
				);
		System.out.println(Math.ceil(c.getArea()/100));
	}

}
