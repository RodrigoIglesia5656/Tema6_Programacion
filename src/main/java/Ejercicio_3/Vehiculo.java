package Ejercicio_3;

public abstract class Vehiculo {
	private String color;
	private String modelo;
	private double precio;
	private String marca;

	public Vehiculo(String color, String modelo, double precio, String marca) {
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Precio: " + precio + "€";
	}
}