package Ejercicio_1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Factura {

	private static int codFactura = 0;

	private LocalDateTime fecha;
	private int numeroFactura;
	private boolean pagada;
	private List<LineaFactura> lineas;

	public Factura() {
		numeroFactura = ++codFactura;
		fecha = LocalDateTime.now();
		pagada = false;
		lineas = new ArrayList<>();
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public List<LineaFactura> getLineas() {
		return lineas;
	}
	
	public boolean addLinea(LineaFactura lf) {
		return lineas.add(lf);
	}

}
