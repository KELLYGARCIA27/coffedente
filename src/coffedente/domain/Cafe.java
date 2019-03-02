package coffedente.domain;

public class Cafe extends Bebida { // heredamos de la clase bebida

	private String grano = " "; // variables unicamente de cafe
	
	public String getGrano() {
		return grano;
	}

	public void setGrano(String grano) {
		this.grano = grano;
	}

	@Override
	void calcularPrecio() { // implementamos calcularPrecio de la clase abstracta.
		switch (this.tamano) {
		case 1:
		if (tamano ==1 )
			this.precio = 50;
			break;
		case 2:
			this.precio = 35;
			break;
		case 3:
			this.precio = 20;
			break;
		default:
			this.precio = 0;
			break;

		}

	}

}
