package coffedente.domain;

public abstract class Bebida {

	protected String nombre;                 //declaramos variables de tipo protected
	protected double precio;                //declaramos variables de tipo protected   
	protected Boolean conLeche = false;     //declaramos variables de tipo protected
 	protected int tamano = 1;               //declaramos variables de tipo protected

 	abstract void calcularPrecio();           //metodo Calcular precio

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {     
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public Boolean getConLeche() {
		return conLeche;
	}

	public void setConLeche(Boolean conLeche) {
		conLeche = conLeche;
	}

	public int getTamano() {
		return tamano;
	}
	
	public void setTamano(int tamano) {
		this.tamano = tamano;            
		this.calcularPrecio();

	}
}
