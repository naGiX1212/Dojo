package la_Alianza_de_los_Reyes_y_los_Magos;

public class Mensaje implements Comparable<Mensaje> {
	private int priority = 0;
	private String msg;
	
	
	public Mensaje(String msg) {
		this.msg = msg;
	}
	public Mensaje(String msg ,boolean priority) {
		this.priority = priority?1:0;
		this.msg = msg;
	}
	
    public int compareTo(Mensaje otroMensaje) {
	    return Integer.compare(otroMensaje.getPriority(),priority);
	 }
	private int getPriority() {
		// TODO Auto-generated method stub
		return priority;
	}
	@Override
	public String toString() {
		return "Mensaje [msg=" + msg + "]";
	}
}
