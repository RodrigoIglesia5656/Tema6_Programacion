package Ejercicio_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Init {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Inicializamos los objetos que gestionarán los datos
		Stock miStock = new Stock();
		CajonFacturas miCajon = new CajonFacturas();

		int opcionPrincipal;

		do {
			System.out.println("\n--- MENU ---");
			System.out.println("1-FACTURAR");
			System.out.println("2-STOCK");
			System.out.println("3-FIN");
			System.out.print("Introduzca la opción deseada: ");
			opcionPrincipal = sc.nextInt();

			switch (opcionPrincipal) {
			case 1:
				menuFacturacion(sc, miCajon);
				break;
			case 2:
				menuStock(sc, miStock);
				break;
			case 3:
				System.out.println("Saliendo del sistema...");
				break;
			default:
				System.out.println("Opción no válida.");
			}
		} while (opcionPrincipal != 3);
	}

	// --- SUBMENÚ DE FACTURACIÓN (Opción 1) ---
	public static void menuFacturacion(Scanner sc, CajonFacturas cajon) {
		int opcion;
		do {
			System.out.println("\n---- FACTURACION ----");
			System.out.println("1-Nueva Factura");
			System.out.println("2-Buscar Factura");
			System.out.println("3-Facturas Pendientes");
			System.out.println("4-Pago Facturas");
			System.out.println("5-Salir");
			System.out.print("Introduzca la opción deseada: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				// Aquí iría la lógica para crear una factura, añadir líneas y guardarla
				System.out.println("Creando nueva factura...");
				break;
			case 2:
				System.out.print("Número de factura a buscar: ");
				int num = sc.nextInt();
				Factura f = cajon.buscar(num);
				System.out.println(f != null ? "Factura encontrada." : "No existe.");
				break;
			case 3:
				System.out.println("Facturas pendientes de cobro:");
				ArrayList<Factura> pendientes = cajon.facturasPendientesCobro();
				// Lógica para mostrar la lista
				break;
			}
		} while (opcion != 5);
	}

	// --- SUBMENÚ DE STOCK (Opción 2) ---
	public static void menuStock(Scanner sc, Stock stock) {
		int opcion;
		do {
			System.out.println("\n---- Stock ----");
			System.out.println("1-Nuevo producto");
			System.out.println("2-Borrar producto");
			System.out.println("3-Buscar producto");
			System.out.println("4-Productos agotados");
			System.out.println("5-Necesidades de compra");
			System.out.println("6-Mostrar stock");
			System.out.println("7-Salir");
			System.out.print("Introduzca la opción deseada: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 4:
				System.out.println("Productos agotados:");
				stock.productosAgotados();
				break;
			case 5:
				System.out.println("Productos bajo mínimos:");
				stock.productosBajoMinimos();
				break;
			// Resto de casos...
			}
		} while (opcion != 7);
	}
}