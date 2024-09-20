package desafío_de_las_Gemas_Encantadas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
	/*
	* En un reino encantado, los alquimistas han encontrado un conjunto de gemas mágicas con propiedades especiales. Cada gema tiene un número asociado que es único, y representa su poder místico. Los alquimistas han descubierto que al combinar dos gemas cuyos poderes suman exactamente k, pueden desatar una poderosa energía mágica.

	Tu misión es ayudar a los alquimistas a encontrar todas las combinaciones posibles de dos gemas cuyo poder combinado sea exactamente k.

	Dado un conjunto de n gemas y un número k que representa el poder objetivo, determina cuántas combinaciones de gemas pueden desatar el poder mágico.

	Entrada: Un array con los poderes de las gemas y el número mágico k.
	Salida: La cantidad de combinaciones de gemas que suman exactamente k.
	Ejemplo:
	Entrada
	Gemas: [1, 3, 4, 6, 8, 9, 2]
	Poder objetivo (k): 10
	Salida
	3
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gemas = {1, 3, 4, 6, 8, 9, 2};
		int objetivo = 10;
		int c = 0;
		for(int i = 0 ; i < gemas.length;i++) {
			for(int j = i+1; j < gemas.length;j++) {
				if((gemas[j] + gemas[i]) == 10) {
					c++;
				}
			}
		}
		System.out.println(c);
		
		
		
		
	}

}
