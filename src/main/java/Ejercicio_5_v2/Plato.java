package Ejercicio_5_v2;

public abstract class Plato implements Comparable<Plato> {
	private static int contadorId = 1;
	private int id;
	private String nombre;
	private double precio;
	private int cantidad;
	private int orden;

	public Plato(String nombre, double precio, int cantidad, int orden) {
		this.id = contadorId++;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.orden = orden;
	}

	public static int getContadorId() {
		return contadorId;
	}

	public static void setContadorId(int contadorId) {
		Plato.contadorId = contadorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	@Override
	public int compareTo(Plato otro) {
		return Integer.compare(otro.orden, this.orden);
	}

	@Override
	public String toString() {
		return "id: " + id + ", nombre: " + nombre + ", precio: " + precio + ", cantidad: " + cantidad + ", orden: "
				+ orden;
	}
}