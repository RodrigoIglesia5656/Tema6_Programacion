package Ejercicio_4;

import java.util.Scanner;

public class Init {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("¿Cuántos electrodomésticos vas a crear?: ");
		int cantidad = sc.nextInt();

		Electrodomestico[] arrayElec = new Electrodomestico[cantidad];

		// Rellenamos el array con ejemplos fijos para no complicar el código pidiendo
		// datos uno a uno
		for (int i = 0; i < cantidad; i++) {
			if (i % 3 == 0) {
				arrayElec[i] = new Electrodomestico(200, 60, 'C', "Verde");
			} else if (i % 3 == 1) {
				arrayElec[i] = new Lavadora(150, 30, 'A', "Blanco", 40);
			} else {
				arrayElec[i] = new Television(250, 15, 'B', "Negro", 42, false);
			}
		}

		double totalLavadoras = 0, totalTelevisiones = 0;

		System.out.println("\n--- LISTADO DE PRECIOS ---");
		for (Electrodomestico elec : arrayElec) {
			double precio = elec.precioFinal();
			System.out.println(elec.getClass().getSimpleName() + " - Precio: " + precio + "€");

			if (elec instanceof Lavadora) {
				totalLavadoras += precio;
			} else if (elec instanceof Television) {
				totalTelevisiones += precio;
			}
		}

		System.out.println("\n--- SUMA DE PRECIOS FINALES ---");
		System.out.println("Suma total de Lavadoras: " + totalLavadoras + "€");
		System.out.println("Suma total de Televisiones: " + totalTelevisiones + "€");

		sc.close();
	}
}