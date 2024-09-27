package patrones.ej01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Composite implements Component{
	List<Component> hijos = new ArrayList<Component>();
	private double areaTotal;
	public Composite(Component...components ) {
		// TODO Auto-generated constructor stub
		this.add(components);
	}
	private void add(Component...components) {
		// TODO Auto-generated method stub
		hijos.addAll(Arrays.asList(components));
	}

	@Override
	public double getArea() {
		double acum = 0;
		for(Component c : hijos) {
			acum += c.getArea();
		}
		return acum;
	}
	public Map<String,Double> getMap(){
		Map<String,Double> total = new HashMap<String,Double>();
		if(hijos.isEmpty())
			return null;
		for(Component c : hijos) {
			total.putAll(c.getMap());
		}
		return total;
	}
	public Map<String,Integer> getCantTemperas(){
		Map<String,Integer> t = new HashMap<String,Integer>();
		Map<String,Double> total  = this.getMap();
		total.forEach((key, value) -> {
		        t.put(key,(int)Math.ceil(value/100));
		    });
		
		return t;
		
	}
}
