package Ejercicio_1;

import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private int numeroFactura;
	private boolean pagada;

	public Factura(LocalDate fecha, int numeroFactura, boolean pagada) {
		this.fecha = fecha;
		this.numeroFactura = numeroFactura;
		this.pagada = pagada;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

}
