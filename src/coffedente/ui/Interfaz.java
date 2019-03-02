package coffedente.ui;

import java.util.List;
import java.util.Scanner;

import coffedente.domain.Bebida;
import coffedente.domain.Cafe;
import coffedente.domain.Frapuccino;
import coffedente.domain.Te;

public class Interfaz {
	protected Boolean conLeche = true;
	private Scanner sc;
	private List<Bebida> listaBebidas;

	public Interfaz(Scanner sc,List<Bebida> listaBebidas) {		
		
		this.sc = sc; 
			
		this.listaBebidas = listaBebidas;
	}

	public void menuCafe() {
		
		// generando instancia cafe

		Cafe cafe = new Cafe();

		// Muestra mensaje nombre
		String msgNombre = ("Escoje el nombre: ");
		System.out.println(msgNombre);
		String nombre = this.sc.next();
		cafe.setNombre(nombre);
		
		// Muestra mensaje grano
		String msgGrano = ("Escoje el grano");
		System.out.println(msgGrano);
		String grano = this.sc.next();
		cafe.setGrano(grano);
		
		// Muestra mensaje tamaño
		String msgTamano = ("Escoje el tamaño 1: grande  2:  mediano  3:chico");
		System.out.println(msgTamano);
		int tamano = this.sc.nextInt();
		cafe.setTamano(tamano);

		//muestra mensaje con leche.
		String msgConLeche = ("Te gustaria tu bebida con leche");
		System.out.println(msgConLeche);
		Boolean conLeche = this.sc.nextBoolean();
		cafe.setConLeche(conLeche);
		listaBebidas.add(cafe);
	
		
	}
	public void menuTe() {

		Te te = new Te(); // instancia.

		// Muestra mensaje nombre
		String msgNombre = ("Escoje el Nombre:");
		System.out.println(msgNombre);
		String nombre = sc.next();
		te.setNombre(nombre);

		// Muestra mensaje nombre
		String msgHoja = ("Escoje la hoja:");
		System.out.println(msgHoja);
		String hoja = sc.next();
		te.setHoja(hoja);
		
		// Muestra mensaje nombre
		String msgTamano = ("Escoje el tamaño \1: grande  2:  mediano  3:chico");
		System.out.println(msgTamano);
		int tamano = sc.nextInt();
		te.setTamano(tamano);
		listaBebidas.add(te);
	}

	public void MenuFrapuccino() {

		Frapuccino frapu = new Frapuccino();
		// Muestra mensaje nombre
		String msgNombre = ("Escoje el Nombre:");
		System.out.println(msgNombre);
		String nombre = sc.next();
		frapu.setNombre(nombre);

		// Muestra mensaje nombre
		String msgCrema = ("Escoje la crema:");
		System.out.println(msgCrema);
		String crema = sc.next();
		frapu.setCrema(crema);
		
		// Muestra mensaje nombre
		String msgTamano = ("Escoje el tamaño \1: grande  2:  mediano  3:chico");
		System.out.println(msgTamano);
		int tamano = sc.nextInt();
		frapu.setTamano(tamano);
		listaBebidas.add(frapu);
	}
}