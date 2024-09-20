package la_Alianza_de_los_Reyes_y_los_Magos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * En un antiguo reino, la realeza y los magos deben trabajar juntos para
		 * defenderse de un mal que amenaza con destruirlo todo. El Consejo de los Magos
		 * ha decidido que es hora de actuar, pero para ello, necesitan comunicarse
		 * rápidamente y elegir un líder que guíe la alianza.
		 */

		/*
		 * Parte 1: El mensajero mágico El reino tiene un mensajero mágico encargado de
		 * entregar los mensajes entre los castillos. Los mensajes se transmiten en el
		 * orden en que fueron recibidos, excepto si un mensaje es de alta prioridad, en
		 * cuyo caso debe ser entregado antes que los demás.
		 */
		PriorityQueue<Mensaje> m = new PriorityQueue<Mensaje>();
		m.add(new Mensaje("este es un mensaje"));
		m.add(new Mensaje("este es un mensaje yes"));
		m.add(new Mensaje("Este es un mensaje prioritario", true));
		m.add(new Mensaje("Esto es  prioritario sala", true));
		m.add(new Mensaje("este es un mensaje nam"));
		for (Mensaje msg : m) {
			System.out.println(msg.toString());
		}
		//----------------------------------------------------------------
		/*
		 * Parte 2: Comparación de hechizos Dos magos, que pertenecen a castillos
		 * diferentes, comparan sus libros de hechizos para ver qué hechizos tienen en
		 * común. A cada mago se le ha entregado una lista de hechizos únicos, pero
		 * necesitan encontrar aquellos que ambos comparten para utilizarlos en la
		 * batalla final.
		 */
		HashSet<String> libroMerlin = new HashSet<String>();
		HashSet<String> libroDazzle = new HashSet<String>();
		libroMerlin.add("alohomora");
		libroMerlin.add("espectrum patronus");
		libroMerlin.add("adabra kadabra");
		libroMerlin.add("fire ball");

		libroDazzle.add("fire ball");
		libroDazzle.add("ice walk");
		libroDazzle.add("fly");
		libroDazzle.add("alohomora");

		libroMerlin.retainAll(libroDazzle);
		System.out.println(libroMerlin);
		/*HashSet<String> hechizosEnComun = new HashSet<String>();
		libroDazzle.forEach(
				n -> {
					if(libroMerlin.contains(n))
						hechizosEnComun.add(n);
				});
		for(String s : hechizosEnComun) {
			System.out.println(s);
		}*/
		
		
	}

}
