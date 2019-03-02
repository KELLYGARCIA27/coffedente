package coffedente.domain;

public class Frapuccino extends Bebida {
	
	private String crema = " ";   // variables unicamente de frapuccino

	public String getCrema() {       
		return crema;
	}

	public void setCrema(String crema) {
		this.crema = crema;
	}

	@Override
	void calcularPrecio() {      //implementamos calcularPrecio de la clase abstracta.
		switch (this.tamano) {
		case 1:
			
			this.precio = 60;break;
		case 2:
			this.precio = 45; break;
		case 3:
			this.precio = 30;break;
		default:
			this.precio = 0;break;

		}

	}

}