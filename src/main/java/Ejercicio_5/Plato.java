package Ejercicio_5;

public class Plato {
	private String nombre;
	private double precio;

	public Plato(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return ("Plato: " + nombre + ", " + precio);
	}
}
