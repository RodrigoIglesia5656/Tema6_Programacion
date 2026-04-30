package Ejercicio_3;

public class Bicicleta extends VehiculoSinMotor {
	private int numMarchas;

	public Bicicleta(String color, String modelo, double precio, String marca, String material,
			int numMarchas) {
		super(color, modelo, precio, marca, material);
		this.numMarchas = numMarchas;
	}
}
