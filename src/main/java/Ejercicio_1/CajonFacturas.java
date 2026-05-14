package Ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class CajonFacturas {

	private List<Factura> facturas;

	public CajonFacturas() {
		facturas = new ArrayList<>();
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public boolean addLinea(Factura f) {
		return facturas.add(f);
	}

	public Factura find(int codFactura) {
		for (Factura f : facturas) {
			if (f.getNumeroFactura() == codFactura) {
				return f;
			}
		}
		return null;
	}

	public List<Factura> facturasPendientesPago() {
		List<Factura> pdtePago = new ArrayList<>();

		for (int i = 0; i < facturas.size(); i++) {
			if (!facturas.get(i).isPagada()) {
				pdtePago.add(facturas.get(i));
			}
		}

		return pdtePago;
	}

}
