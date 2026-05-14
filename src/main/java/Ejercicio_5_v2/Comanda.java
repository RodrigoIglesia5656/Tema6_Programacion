package Ejercicio_5_v2;

import java.util.*;

public class Comanda {
	private int numeroMesa;
	private int cantidadComensales;
	private Map<Integer, Plato> platos;

	public Comanda(int numeroMesa, int cantidadComensales) {
		this.numeroMesa = numeroMesa;
		this.cantidadComensales = cantidadComensales;
		this.platos = new HashMap<>();
	}

	public void añadirPlato(Plato p) {
		platos.put(p.getId(), p);
	}

	public double precioTotal() {
		double total = 0;
		for (Plato p : platos.values()) {
			total = total + (p.getPrecio() * p.getCantidad());
		}
		return total;
	}

	public boolean libreAzucar() {
		for (Plato p : platos.values()) {
			if (p instanceof Postre && ((Postre) p).isTieneAzucar())
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		String res = "--- FACTURA ---\n" + "Número de mesa: " + numeroMesa + " \nNúmero de comensales: " + cantidadComensales
				+ "\n" + "--- PLATOS ---\n";

		List<Plato> listaPlatos = new ArrayList<>(platos.values());
		Collections.sort(listaPlatos);

		for (Plato p : listaPlatos) {
			res = res + p.toString() + "\n";
		}

		res = res + "Coste total: " + precioTotal() + "\n" + "Libre de azúcares: " + (libreAzucar() ? "si" : "no")
				+ "\n";

		return res;
	}
}
