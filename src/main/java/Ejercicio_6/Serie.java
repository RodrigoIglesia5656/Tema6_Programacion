package Ejercicio_6;

public class Serie implements Prestable {
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String director;

	// Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numeroTemporadas = 2;
		this.entregado = false;
		this.genero = "";
		this.director = "";
	}

	// Constructor con titulo y director
	public Serie(String titulo, String director) {
		this.titulo = titulo;
		this.numeroTemporadas = 2;
		this.entregado = false;
		this.genero = "";
		this.director = director;
	}

	// Constructor con todos los atributos excepto entregado
	public Serie(String titulo, int numeroTemporadas, String genero, String director) {
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.director = director;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	// Métodos sobrescritos de la clase Object
	@Override
	public String toString() {
		return "Serie: " + titulo + " | Temporadas: " + numeroTemporadas + " | Género: " + genero + " | Director: "
				+ director + " | Entregado: " + entregado;
	}

	@Override
	public boolean equals(Object a) {
		if (a instanceof Serie) {
			Serie otra = (Serie) a;
			return this.titulo.equals(otra.titulo) && this.director.equals(otra.director);
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
		if (a instanceof Serie) {
			Serie otra = (Serie) a;
			return Integer.compare(this.numeroTemporadas, otra.numeroTemporadas);
		}
		return 0;
	}
}