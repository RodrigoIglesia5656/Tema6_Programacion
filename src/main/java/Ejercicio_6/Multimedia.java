package Ejercicio_6;

public abstract class Multimedia implements Prestable {
	protected String titulo;
	protected String genero;
	protected boolean entregado;

	public Multimedia() {
		this.titulo = "";
		this.genero = "";
		this.entregado = false;
	}

	public Multimedia(String titulo, String genero) {
		this.titulo = titulo;
		this.genero = genero;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void entregar() {
		this.entregado = true;
	}

	public void devolver() {
		this.entregado = false;
	}

	public boolean esEntregado() {
		return this.entregado;
	}
}