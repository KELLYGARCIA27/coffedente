package coffedente.domain;

import java.util.List;

public class Ticket {

	public static void calcular(List<Bebida> bebidas) {
		
		double total = 0;
		
		for(Bebida bebida : bebidas) {
			total += bebida.precio;
			System.out.println("Bebida "+bebida.nombre+" "+bebida.precio+" tamano: "+bebida.tamano);
		}
		
		System.out.println("Su total es: "+total);
		
	} 
	
	
}


