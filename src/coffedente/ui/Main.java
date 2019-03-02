package coffedente.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import coffedente.domain.Bebida;
import coffedente.domain.Ticket;

public class Main {

	private boolean agregarProducto = true;
	private Scanner sc;
	
	// se usan como arreglos dinamicos no se especifica tamano
	private List<Bebida> listaBebidas;
	
	public static void main(String[] args) {
		Main miMain = new Main();                             //instancia
		miMain.ejecutarPrograma();                            //metodo
	}
	public void ejecutarPrograma() {                           //metodo
		this.listaBebidas = new ArrayList <> ();              
		while (this.agregarProducto) {
			sc = new Scanner(System.in); 		

			System.out.println("   ___ ___  / _|/ _| ___  __| | ___ _ __ | |_ ___ \r\n" + 
					"  / __/ _ \\| |_| |_ / _ \\/ _` |/ _ \\ '_ \\| __/ _ \\\r\n" + 
					" | (_| (_) |  _|  _|  __/ (_| |  __/ | | | ||  __/\r\n" + 
					"  \\___\\___/|_| |_|  \\___|\\__,_|\\___|_| |_|\\__\\___|");
			
			System.out.println("Desea agregar una bebida?\n");			
			
			if (sc.hasNextBoolean()) {					
				this.agregarProducto = sc.nextBoolean();
				if(this.agregarProducto == true) {
					this.mostrarBienvenida();
				}
			} else {
				this.agregarProducto = true; 
			}
		}
		sc.close();
		Ticket.calcular(listaBebidas);
	}
	
	public void mostrarBienvenida() {
		System.out.println("Escoja la bebida 1:cafe, 2:Te, 3:Frapuchino");		
		if (sc.hasNextInt()) {
			int opt = sc.nextInt();
			do {
				this.mostrarMenu(opt);
			}
			while(!this.evaluaOption(opt));
		}
	}
	// metodo que muestra los menus de las bebidas
	public void mostrarMenu(int opt) {
		Interfaz interfax = new Interfaz(sc, listaBebidas);
		switch (opt) {

		case 1:
			interfax.menuCafe();
			break;
		case 2:
			interfax.menuTe();
			break;
		case 3:
			interfax.MenuFrapuccino();
			break; 
		}
	} 
	
	public void muestraLista(List<Bebida> listaBebidas) {
		for (int x = 0; x < listaBebidas.size(); x++) {
			System.out.println(listaBebidas.get(x).getNombre() + " " + listaBebidas.get(x).getPrecio());
		} 
	}

	public boolean evaluaOption(int opt) {
		return opt == 1 || opt == 2 || opt == 3;
	}
}

















/*
 * CafeiCafe = new Cafe(); //Declaro instancia miCafe
 * 
 * miCafe.setConLeche(true); //se utiliza la variable de instancia NO el nombre
 * de la clase ;). miCafe.setGrano("americano"); //importante declarar variable
 * "americano" miCafe.setNombre("kelly"); //importante declarar variable "kelly"
 * miCafe.setTamano(3); //importante declarar variable numero del tamaño "3"
 * 
 * System.out.println("el precio del cafe es :" + miCafe.getPrecio()); //
 * imprime el resultado deseado.
 * 
 * Te miTe = new Te();
 * 
 * miTe.setConLeche(true); miTe.setHoja("manzanilla"); miTe.setNombre("kelly");
 * miTe.setTamano(2);
 * 
 * System.out.println("el precio del Te es :" + miTe.getPrecio()); // imprime el
 * resultado deseado.
 * 
 * Frapuccino miFrapu = new Frapuccino();
 * 
 * miFrapu.setCrema(" "); miFrapu.setNombre(" "); miFrapu.setTamano(1);
 * 
 * System.out.println("el precio del Frapuccino es :" + miFrapu.getPrecio()); //
 * imprime el resultado deseado.
 * 
 * }
 * 
 * } *\
 */