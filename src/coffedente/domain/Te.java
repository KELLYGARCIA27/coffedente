package coffedente.domain;

public class Te extends Bebida {
	
	private String hoja = " ";   // variables unicamente de cafe

	public String gethoja() {       
		return hoja;
	}

	public void setHoja(String hoja) {
		this.hoja = hoja;
	}

	@Override
	void calcularPrecio() {      //implementamos calcularPrecio de la clase abstracta.
		switch (this.tamano) {
		case 1:
			this.precio = 35;break;
		case 2:
			this.precio = 25; break;
		case 3:
			this.precio = 15;break;
		default:
			this.precio = 0;break;

		}

	}

}
