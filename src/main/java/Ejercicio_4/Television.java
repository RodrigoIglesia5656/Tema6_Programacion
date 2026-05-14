package Ejercicio_4;

public class Television extends Electrodomestico {
	private final static double TAMANO_DEFECTO = 20.0;
	private final static boolean SINTONIZADOR_DEFECTO = true;

	private double tamano;
	private boolean sintonizadorTDT;

	public Television() {
		super();
		this.tamano = TAMANO_DEFECTO;
		this.sintonizadorTDT = SINTONIZADOR_DEFECTO;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.tamano = TAMANO_DEFECTO;
		this.sintonizadorTDT = SINTONIZADOR_DEFECTO;
	}

	public Television(double precioBase, double peso, char consumoEnergetico, String color, double tamano,
			boolean sintonizadorTDT) {
		super(precioBase, peso, consumoEnergetico, color);
		this.tamano = tamano;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	public double getTamano() {
		return tamano;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	@Override
	public double precioFinal() {
		double total = super.precioFinal();

		if (tamano >= 40) {
			total += (total * 0.30);
		}
		if (sintonizadorTDT) {
			total += 50;
		}

		return total;
	}
}