package Ejercicio_5;

public class Postre extends Plato {
	private boolean conAzucar;

	public Postre(String nombre, double precio, boolean conAzucar) {
		super(nombre, precio);
		this.conAzucar = conAzucar;
	}
	public boolean conAzucar() {
		return conAzucar;
	}
	@Override
	public String toString() {
		return super.toString() + " | " + (conAzucar ? "Con azúcar" : "Sin azúcar");
	}
}