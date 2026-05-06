package Ejercicio_5;

public class Primero extends Plato {
	private boolean compartir;

	public Primero(String nombre, double precio, boolean compartir) {
		super(nombre, precio);
		this.compartir = compartir;
	}

	@Override
	public String toString() {
		return super.toString() + " | Compartir: " + (compartir ? "Sí" : "No");
	}
}