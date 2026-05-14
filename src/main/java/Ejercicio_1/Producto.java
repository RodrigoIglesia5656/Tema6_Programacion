package Ejercicio_1;

import java.util.Objects;

public class Producto {
	
	private static int contadorCodigo = 1;

	private int codigo;
	private String descripcion;
	private double precio;
	private int cantidadDisponible;
	private int minimo;

	public Producto(String descripcion) {
		codigo = contadorCodigo++;
		this.descripcion = descripcion;
	}

	public Producto(String descripcion, double precio, int cantidadDisponible, int minimo) {
		this(descripcion);
		this.precio = precio;
		this.cantidadDisponible = cantidadDisponible;
		this.minimo = minimo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int cantidad) {
		this.cantidadDisponible = cantidad;
	}

	public int getMinimo() {
		return minimo;
	}

	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidad="
				+ cantidadDisponible + ", minimo=" + minimo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidadDisponible, codigo, descripcion, minimo, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cantidadDisponible == other.cantidadDisponible && codigo == other.codigo && Objects.equals(descripcion, other.descripcion)
				&& minimo == other.minimo && Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

}
