package Ejercicio_3;

public class Patinete extends VehiculoSinMotor {
	private int numRuedas;

	public Patinete(String color, String modelo, double precio, String marca, String material, int numRuedas) {
		super(color, modelo, precio, marca, material);
		this.numRuedas = numRuedas;
	}
}
