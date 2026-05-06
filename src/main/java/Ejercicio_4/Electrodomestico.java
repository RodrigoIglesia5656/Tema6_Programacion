package Ejercicio_4;

public class Electrodomestico {

	private final static String COLOR_DEFECTO = "blanco";
	private final static char CONSUMO_DEFECTO = 'F';
	private final static double PRECIO_DEFECTO = 100.0;
	private final static double PESO_DEFECTO = 5.0;

	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;

	public Electrodomestico() {
		this(PRECIO_DEFECTO, PESO_DEFECTO, CONSUMO_DEFECTO, COLOR_DEFECTO);
	}

	public Electrodomestico(double precioBase, double peso) {
		this(precioBase, peso, CONSUMO_DEFECTO, COLOR_DEFECTO);
	}

	public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color) {
		this.precioBase = precioBase;
		this.peso = peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
	}

	private void comprobarConsumoEnergetico(char letra) {
		String validas = "ABCDEF";
		if (validas.indexOf(Character.toUpperCase(letra)) >= 0) {
			this.consumoEnergetico = Character.toUpperCase(letra);
		} else {
			this.consumoEnergetico = CONSUMO_DEFECTO;
		}
	}

	private void comprobarColor(String color) {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean encontrado = false;
		for (String c : colores) {
			if (c.equalsIgnoreCase(color)) {
				this.color = c.toLowerCase();
				encontrado = true;
				break;
			}
		}
		if (!encontrado)
			this.color = COLOR_DEFECTO;
	}

	public double precioFinal() {
		double total = precioBase;

		switch (consumoEnergetico) {
		case 'A':
			total += 100;
			break;
		case 'B':
			total += 80;
			break;
		case 'C':
			total += 60;
			break;
		case 'D':
			total += 50;
			break;
		case 'E':
			total += 30;
			break;
		case 'F':
			total += 10;
			break;
		}

		if (peso >= 0 && peso <= 19)
			total += 10;
		else if (peso >= 20 && peso <= 49)
			total += 50;
		else if (peso >= 50 && peso <= 79)
			total += 80;
		else if (peso >= 80)
			total += 100;

		return total;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}
}