package Ejercicio_3;

//Clase para vehículos que usan combustible
public abstract class VehiculoMotor extends Vehiculo {
	private int cilindrada;
	private String combustible;

	public VehiculoMotor(String color, String modelo, double precio, String marca, int cilindrada, String combustible) {
		super(color, modelo, precio, marca);
		this.cilindrada = cilindrada;
		this.combustible = combustible;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return super.toString() + ", Cilindrada: " + cilindrada + "cc, Combustible: " + combustible;
	}
}
