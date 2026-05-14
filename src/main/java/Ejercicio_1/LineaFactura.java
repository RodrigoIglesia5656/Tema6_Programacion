package Ejercicio_1;

import java.util.Objects;

public class LineaFactura {

	private static int contadorCodigo = 1;

	private int codigo;
	private double precio;
	private int cantidad;

	public LineaFactura(double precio, int cantidad) {
		this.codigo = contadorCodigo++;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getCodigo() {
		return codigo;
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

	@Override
	public String toString() {
		return "LineaFactura [codigo=" + codigo + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantidad, codigo, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaFactura other = (LineaFactura) obj;
		return cantidad == other.cantidad && codigo == other.codigo
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

}
