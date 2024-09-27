package patrones.ej01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
