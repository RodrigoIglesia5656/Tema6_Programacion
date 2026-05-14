package Ejercicio_5_v2;

public class Primero extends Plato {
	private boolean paraCompartir;

	public Primero(String nombre, double precio, int cantidad, int orden, boolean paraCompartir) {
		super(nombre, precio, cantidad, orden);
		this.paraCompartir = paraCompartir;
	}

	@Override
	public String toString() {
		return "Entrante " + super.toString() + " para compartir: " + (paraCompartir ? "si" : "no");
	}
}
