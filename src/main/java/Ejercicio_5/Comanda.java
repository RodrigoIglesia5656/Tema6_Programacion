package Ejercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Comanda {
	private int numeroMesa;
	private int numComensales;
	private List<Plato> platos;

	public Comanda(int numeroMesa, int numComensales) {
		this.numeroMesa = numeroMesa;
		this.numComensales = numComensales;
		this.platos = new ArrayList<>();
	}

	public void añadirPlato(Plato plato) {
		platos.add(plato);
	}

	public double coste() {
		double total = 0;
		for (Plato p : platos) {
			total += p.getPrecio();
		}
		return total;
	}

	public boolean hayDiabeticosEnLaMesa() {
		for (Plato p : platos) {
			if (p instanceof Postre) {
				Postre postre = (Postre) p;
				// Si encontramos un postre y NO tiene azúcar, hay diabéticos
				if (!postre.conAzucar()) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String resultado = "Mesa: " + numeroMesa + " | Comensales: " + numComensales + "\n";
		resultado += "--- PLATOS PEDIDOS ---\n";

		for (Plato p : platos) {
			resultado += p.toString() + "\n";
		}

		resultado += "----------------------\n";
		resultado += "Coste total de lo pedido: " + coste() + "€\n";

		return resultado;
	}
}
