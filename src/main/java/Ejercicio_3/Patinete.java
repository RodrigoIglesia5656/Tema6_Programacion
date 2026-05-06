package Ejercicio_3;

public class Patinete extends VehiculoSinMotor {
	private int numeroRuedas;

	public Patinete(String color, String modelo, double precio, String marca, String material, int numeroRuedas) {
		super(color, modelo, precio, marca, material);
		this.numeroRuedas = numeroRuedas;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	@Override
	public String toString() {
		return "PATINETE -> " + super.toString() + ", Ruedas: " + numeroRuedas;
	}
}
