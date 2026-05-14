package Ejercicio_5_v2;

public class Postre extends Plato {
	private boolean tieneAzucar;

	public Postre(String nombre, double precio, int cantidad, int orden, boolean tieneAzucar) {
		super(nombre, precio, cantidad, orden);
		this.tieneAzucar = tieneAzucar;
	}

	public boolean isTieneAzucar() {
		return tieneAzucar;
	}

	@Override
	public String toString() {
		return "Postre " + super.toString() + ", tiene azucar: " + (tieneAzucar ? "si" : "no");
	}
}
