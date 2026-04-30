package Ejercicio_1;

public class Producto {
	private int codigo;
	private String descripcion;
	private float precio;
	private int cantidad;
	private int minimo;

	public Producto(int codigo, String descripcion, float precio, int cantidad, int minimo) {
		this.cantidad = cantidad;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.minimo = minimo;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	@Override
	public String toString() {
		return "Producto: " + "\nCodigo: " + codigo + "\nDescripcion: " + descripcion + "\nPrecio: " + precio
				+ "\nCantidad: " + cantidad + "\nMinimo: " + minimo;
	}

}
