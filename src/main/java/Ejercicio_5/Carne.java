package Ejercicio_5;

public class Carne extends Plato {
	private String punto;

	public Carne(String nombre, double precio, String punto) {
		super(nombre, precio);
		this.punto = punto;
	}

	@Override
	public String toString() {
		return super.toString() + " | Punto: " + punto;
	}
}
