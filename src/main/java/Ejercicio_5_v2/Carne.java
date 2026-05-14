package Ejercicio_5_v2;

import java.util.ArrayList;
import java.util.List;

public class Carne extends Plato {
	private List<String> puntoCarne;

	public Carne(String nombre, double precio, int cantidad, int orden) {
		super(nombre, precio, cantidad, orden);
		this.puntoCarne = new ArrayList<>();
	}

	public void añadirCarne(String estado) {
		puntoCarne.add(estado);
		this.setCantidad(puntoCarne.size());
	}

	@Override
	public String toString() {
		String res = "Carne " + super.toString() + "\nPunto de la carne:";
		for (String grado : puntoCarne) {
			res = res + "\n" + grado;
		}
		return res;
	}
}
