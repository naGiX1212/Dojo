package patrones.ej01;

import java.util.HashMap;
import java.util.Map;

public class Circulo implements Component {

	private double r;
	public String color;
	public Circulo(String color,double r) {
		this.r = r;
		this.color = color;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(r, 2);
	}
	public Map<String,Double> getMap(){
		Map<String,Double> m = new HashMap<String,Double>();
		m.put(color,this.getArea());
		return m;
	}
}
