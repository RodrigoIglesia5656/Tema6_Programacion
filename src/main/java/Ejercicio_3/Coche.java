package Ejercicio_3;

public class Coche extends VehiculoMotor {
	private int numPuertas;

	public Coche(String color, String modelo, double precio, String marca, int cilindrada, String combustible,
			int numPuertas) {
		super(color, modelo, precio, marca, cilindrada, combustible);
		this.numPuertas = numPuertas;
	}
}
