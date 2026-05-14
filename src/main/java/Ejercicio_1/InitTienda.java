package Ejercicio_1;

import java.util.List;
import java.util.Scanner;

public class InitTienda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stock stock = new Stock();
		CajonFacturas cajon = new CajonFacturas();
		int opcPrincipal = 0;

		// Añadimos un par de productos de prueba para que no tengas que crearlos cada
		// vez
		stock.addProducto(new Producto("Teclado Mecánico", 45.50, 10, 3));
		stock.addProducto(new Producto("Ratón Gaming", 25.00, 2, 5));

		do {
			System.out.println("\n--- MENU PRINCIPAL ---");
			System.out.println("1-FACTURAR");
			System.out.println("2-STOCK");
			System.out.println("3-FIN");
			System.out.print("Introduzca la opción deseada: ");

			if (sc.hasNextInt()) {
				opcPrincipal = sc.nextInt();
				sc.nextLine(); // Limpiar el buffer

				switch (opcPrincipal) {
				case 1:
					menuFacturacion(sc, cajon, stock);
					break;
				case 2:
					menuStock(sc, stock);
					break;
				case 3:
					System.out.println("Saliendo del programa...");
					break;
				default:
					System.out.println("Opción no válida.");
				}
			} else {
				System.out.println("Error: Por favor introduzca un número.");
				sc.next(); // Limpiar entrada errónea
			}
		} while (opcPrincipal != 3);

		sc.close();
	}

	private static void menuStock(Scanner sc, Stock stock) {
		int opcStock = 0;
		do {
			System.out.println("\n---- STOCK ----");
			System.out.println("1-Nuevo producto");
			System.out.println("2-Borrar producto");
			System.out.println("3-Buscar producto");
			System.out.println("4-Productos agotados");
			System.out.println("5-Necesidades de compra");
			System.out.println("6-Salir");
			System.out.print("Introduzca la opción deseada: ");

			if (sc.hasNextInt()) {
				opcStock = sc.nextInt();
				sc.nextLine();

				switch (opcStock) {
				case 1:
					System.out.print("Descripción: ");
					String desc = sc.nextLine();
					System.out.print("Precio: ");
					double precio = sc.nextDouble();
					System.out.print("Cantidad disponible: ");
					int cant = sc.nextInt();
					System.out.print("Cantidad mínima: ");
					int min = sc.nextInt();
					sc.nextLine();

					Producto p = new Producto(desc, precio, cant, min);
					stock.addProducto(p);
					System.out.println("Producto añadido con éxito. Código asignado: " + p.getCodigo());
					break;

				case 2:
					System.out.print("Introduzca el código del producto a borrar: ");
					int codBorrar = sc.nextInt();
					sc.nextLine();

					Producto borrado = stock.deleteProducto(codBorrar);
					if (borrado != null) {
						System.out.println("Se ha borrado el producto: " + borrado.getDescripcion());
					} else {
						System.out.println("No se encontró ningún producto con ese código.");
					}
					break;

				case 3:
					System.out.print("Introduzca el código del producto a buscar: ");
					int codBuscar = sc.nextInt();
					sc.nextLine();

					Producto encontrado = stock.findProductoById(codBuscar);
					if (encontrado != null) {
						System.out.println(encontrado.toString());
					} else {
						System.out.println("No se encontró ningún producto con ese código.");
					}
					break;

				case 4:
					System.out.println("\n--- Productos Agotados ---");
					List<Producto> agotados = stock.productosAgotados();
					if (agotados.isEmpty()) {
						System.out.println("No hay productos agotados.");
					} else {
						for (Producto prod : agotados) {
							System.out.println(prod.toString());
						}
					}
					break;

				case 5:
					System.out.println("\n--- Necesidades de Compra (Bajo mínimos) ---");
					List<Producto> bajoMinimos = stock.productosBajoMinimos();
					if (bajoMinimos.isEmpty()) {
						System.out.println("El stock está en niveles óptimos.");
					} else {
						for (Producto prod : bajoMinimos) {
							System.out.println(prod.toString());
						}
					}
					break;
				case 6:
					System.out.println("\n--- Mostrar Stock ---");
					List<Producto> productosStock = stock.getListaProductos();
					if (!productosStock.isEmpty()) {
						System.out.println("Código\tDescripcion\tPrecio\tCantidad disponible\tCantidad");
						for (Producto prod : productosStock) {
							System.out.println(prod.toString());
						}
					}
				case 7:
					System.out.println("Volviendo al menú principal...");
					break;

				default:
					System.out.println("Opción no válida.");
				}
			} else {
				System.out.println("Error: Por favor introduzca un número.");
				sc.next();
			}
		} while (opcStock != 6);
	}

	private static void menuFacturacion(Scanner sc, CajonFacturas cajon, Stock stock) {
		int opcFac = 0;
		do {
			System.out.println("\n---- FACTURACION ----");
			System.out.println("1-Nueva Factura");
			System.out.println("2-Buscar Factura");
			System.out.println("3-Facturas Pendientes");
			System.out.println("4-Pago Facturas");
			System.out.println("5-Salir");
			System.out.print("Introduzca la opción deseada: ");

			if (sc.hasNextInt()) {
				opcFac = sc.nextInt();
				sc.nextLine();

				switch (opcFac) {
				case 1:
					Factura nuevaFactura = new Factura();
					System.out.println("Se ha iniciado la Factura Nº " + nuevaFactura.getNumeroFactura());

					String continuar;
					do {
						System.out.print("Introduzca el código del producto a añadir: ");
						int codProd = sc.nextInt();
						sc.nextLine();

						Producto prod = stock.findProductoById(codProd);
						if (prod != null) {
							System.out.print("Introduzca la cantidad: ");
							int cantidad = sc.nextInt();
							sc.nextLine();

							if (cantidad <= prod.getCantidadDisponible()) {
								// Creamos la línea y la añadimos a la factura
								LineaFactura linea = new LineaFactura(prod.getPrecio(), cantidad);
								nuevaFactura.addLinea(linea);

								// Restamos la cantidad del stock real
								prod.setCantidadDisponible(prod.getCantidadDisponible() - cantidad);
								System.out.println("Línea de producto añadida correctamente.");
							} else {
								System.out.println("Stock insuficiente. Solo hay " + prod.getCantidadDisponible()
										+ " unidades disponibles.");
							}
						} else {
							System.out.println("Error: El producto con código " + codProd + " no existe.");
						}

						System.out.print("¿Desea añadir otro producto a la factura? (s/n): ");
						continuar = sc.nextLine();
					} while (continuar.equalsIgnoreCase("s"));

					// Usamos addLinea de CajonFacturas
					cajon.addLinea(nuevaFactura);
					System.out.println("Factura Nº " + nuevaFactura.getNumeroFactura() + " guardada en el cajón.");
					break;

				case 2:
					System.out.print("Introduzca el número de la factura a buscar: ");
					int numBusqueda = sc.nextInt();
					sc.nextLine();

					Factura fEncontrada = cajon.find(numBusqueda);
					imprimirDatosFactura(fEncontrada);
					break;

				case 3:
					System.out.println("\n--- Facturas Pendientes de Cobro ---");
					// Usamos facturasPendientesPago
					List<Factura> pendientes = cajon.facturasPendientesPago();
					if (pendientes.isEmpty()) {
						System.out.println("No hay facturas pendientes de pago.");
					} else {
						for (Factura f : pendientes) {
							imprimirDatosFactura(f);
							System.out.println("-------------------------");
						}
					}
					break;

				case 4:
					System.out.print("Introduzca el número de la factura a pagar: ");
					int numPagar = sc.nextInt();
					sc.nextLine();

					Factura fPagar = cajon.find(numPagar);
					if (fPagar != null) {
						if (fPagar.isPagada()) {
							System.out.println("La factura ya estaba pagada anteriormente.");
						} else {
							fPagar.setPagada(true);
							System.out.println(
									"La Factura Nº " + fPagar.getNumeroFactura() + " se ha cobrado correctamente.");
						}
					} else {
						System.out.println("Factura no encontrada.");
					}
					break;

				case 5:
					System.out.println("Volviendo al menú principal...");
					break;

				default:
					System.out.println("Opción no válida.");
				}
			} else {
				System.out.println("Error: Por favor introduzca un número.");
				sc.next();
			}
		} while (opcFac != 5);
	}

	// Método de ayuda para imprimir facturas de forma bonita, ya que Factura no
	// tiene toString()
	private static void imprimirDatosFactura(Factura f) {
		if (f == null) {
			System.out.println("No se han encontrado datos de la factura.");
			return;
		}
		System.out.println("Factura Nº: " + f.getNumeroFactura());
		System.out.println("Fecha: " + f.getFecha());
		System.out.println("Estado: " + (f.isPagada() ? "PAGADA" : "PENDIENTE"));
		System.out.println("Lineas de compra:");

		if (f.getLineas().isEmpty()) {
			System.out.println("  (No hay productos en esta factura)");
		} else {
			double total = 0;
			for (LineaFactura lf : f.getLineas()) {
				System.out.println("  - " + lf.toString());
				total += (lf.getPrecio() * lf.getCantidad());
			}
			System.out.println("Total a pagar: " + total + "€");
		}
	}
}