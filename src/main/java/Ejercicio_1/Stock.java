package Ejercicio_1;

import java.util.ArrayList;

public class Stock {
	private ArrayList<Producto> listaProductos;

	public Stock() {
		this.listaProductos = new ArrayList<>();
	}

	public void añadirProductos(Producto nuevoProducto) {
		listaProductos.add(nuevoProducto);
	}
	
	public Producto buscarProducto(int codigoBuscado) {
		for (Producto p : listaProductos) {
			if (p.getCodigo() == codigoBuscado) {
				return p; // Si el bucle encuentra algo lo devuelve y termina la busqueda
			}
		}
		return null; // Si el bucle no encuentra nada, devuelve "nada".
	}
	// Retorna lista de productos con cantidad igual a 0
    public ArrayList<Producto> productosAgotados() {
        ArrayList<Producto> agotados = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p.getCantidad() == 0) {
                agotados.add(p);
            }
        }
        return agotados;
    }

    // Retorna lista de productos con cantidad menor al mínimo establecido
    public ArrayList<Producto> productosBajoMinimos() {
        ArrayList<Producto> bajoMinimos = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p.getCantidad() < p.getMinimo()) {
                bajoMinimos.add(p);
            }
        }
        return bajoMinimos;
    }
} // Fin de la clase Stock

