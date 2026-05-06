package Ejercicio_3;

public class Moto extends VehiculoMotor {
	private String tipo; // Ej: Deportiva, Scooter, Custom

	public Moto(String color, String modelo, double precio, String marca, int cilindrada, String combustible,
			String tipo) {
		super(color, modelo, precio, marca, cilindrada, combustible);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "MOTO -> " + super.toString() + ", Tipo: " + tipo;
	}
}