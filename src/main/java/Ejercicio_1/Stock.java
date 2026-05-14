package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	
	private List<Producto> listaProductos;

	public Stock() {
		listaProductos = new ArrayList<>();	
	}
	
	public boolean addProducto(Producto p) {
		return listaProductos.add(p);
	}
	
	public Producto deleteProducto(int id) {
		for (int i = 0; i < listaProductos.size(); i++) {
			if(listaProductos.get(i).getCodigo() == id) {
				return listaProductos.remove(i);
			}
		}
		return null;
	}
	
	public Producto findProductoById(int id) {
		for (int i = 0; i < listaProductos.size(); i++) {
			if(listaProductos.get(i).getCodigo() == id) {
				return listaProductos.get(i);
			}
		}
		return null;
	}
	
	public List<Producto> productosAgotados() {
		List<Producto> prodAgotados = new ArrayList<>();
		for(Producto p: listaProductos) {
			if(p.getCantidadDisponible() == 0) {
				prodAgotados.add(p);
			}
		}
		return prodAgotados;
	}
	
	/**Devuelve un listado de productos cuya cantidad está por debajo del mínimo
	 * @return listado de productos
	 */
	public List<Producto> productosBajoMinimos() {
		List<Producto> prodBajoMinimos = new ArrayList<>();
		for(Producto p: listaProductos) {
			if(p.getCantidadDisponible() < p.getMinimo()) {
				prodBajoMinimos.add(p);
			}
		}
		return prodBajoMinimos;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	
}
