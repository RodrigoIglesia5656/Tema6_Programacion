package Ejercicio_4;

public class Lavadora extends Electrodomestico {
	private final static double CARGA_DEFECTO = 5.0;

	private double carga;

	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO;
	}

	public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, double carga) {
		super(precioBase, peso, consumoEnergetico, color);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double total = super.precioFinal();
		if (carga > 30) {
			total += 50;
		}
		return total;
	}
}