package patrones.ej01;

import java.util.HashMap;
import java.util.Map;

public class Cuadrado implements Component{
	
	public String color;
	private double lado;
	public Cuadrado(String color,double lado) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
		this.color = color;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		return Math.pow(lado, 2);
	}
	public Map<String,Double> getMap(){
		Map<String,Double> m = new HashMap<String,Double>();
		m.put(color,this.getArea());
		return m;
	}
	


}
