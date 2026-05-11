package Ejercicio_6;

public class Juego implements Prestable {
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String productora;

	// Constructor por defecto
	public Juego() {
		this.titulo = "";
		this.horasEstimadas = 90;
		this.entregado = false;
		this.genero = "";
		this.productora = "";
	}

	// Constructor con titulo y horas
	public Juego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.productora = "";
	}

	// Constructor con todos los atributos excepto entregado
	public Juego(String titulo, int horasEstimadas, String genero, String productora) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.productora = productora;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProductora() {
		return productora;
	}

	public void setProductora(String productora) {
		this.productora = productora;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	// Métodos sobrescritos de la clase Object
	@Override
	public String toString() {
		return "Juego: " + titulo + " | Horas: " + horasEstimadas + " | Género: " + genero + " | Productora: "
				+ productora + " | Entregado: " + entregado;
	}

	@Override
	public boolean equals(Object a) {
		if (a instanceof Juego) {
			Juego otro = (Juego) a;
			return this.titulo.equals(otro.titulo) && this.productora.equals(otro.productora);
		}
		return false;
	}

	// Métodos de la interfaz Prestable
	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		this.entregado = false;
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}

	// Método de la interfaz Comparable
	@Override
	public int compareTo(Object a) {
		if (a instanceof Juego) {
			Juego otro = (Juego) a;
			return Integer.compare(this.horasEstimadas, otro.horasEstimadas);
		}
		return 0;
	}
}
