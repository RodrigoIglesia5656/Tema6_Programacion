package Ejercicio_3;

public class Bicicleta extends VehiculoSinMotor {
	private int numeroMarchas;

	public Bicicleta(String color, String modelo, double precio, String marca, String material, int numeroMarchas) {
		super(color, modelo, precio, marca, material);
		this.numeroMarchas = numeroMarchas;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}

	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}

	@Override
	public String toString() {
		return "BICICLETA -> " + super.toString() + ", Marchas: " + numeroMarchas;
	}
}