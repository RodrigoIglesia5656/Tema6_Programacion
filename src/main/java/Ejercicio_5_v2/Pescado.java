package Ejercicio_5_v2;

public class Pescado extends Plato {
	public Pescado(String nombre, double precio, int cantidad, int orden) {
		super(nombre, precio, cantidad, orden);
	}

	@Override
	public String toString() {
		return "Pescado " + super.toString();
	}
}
