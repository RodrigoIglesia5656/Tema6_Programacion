package Ejercicio_3;

public class Coche extends VehiculoMotor {
	private int numeroPuertas;

	public Coche(String color, String modelo, double precio, String marca, int cilindrada, String combustible,
			int numeroPuertas) {
		super(color, modelo, precio, marca, cilindrada, combustible);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "COCHE: " + super.toString() + "n/Puertas: " + numeroPuertas;
	}
}