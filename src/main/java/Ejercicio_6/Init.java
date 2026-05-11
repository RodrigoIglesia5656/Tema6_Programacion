package Ejercicio_6;

public class Init {
	public static void main(String[] args) {

		// 1. Crear arrays de 4 posiciones
		Serie[] listaSeries = new Serie[4];
		Juego[] listaJuegos = new Juego[4];

		// 2. Crear objetos usando distintos constructores
		listaSeries[0] = new Serie();
		listaSeries[1] = new Serie("The Wire", "David Simon");
		listaSeries[2] = new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
		listaSeries[3] = new Serie("Los Simpson", 34, "Comedia", "Matt Groening");

		listaJuegos[0] = new Juego();
		listaJuegos[1] = new Juego("Operació Vilhoja", 15);
		listaJuegos[2] = new Juego("The Witcher 3", 100, "Rol", "CD Projekt RED");
		listaJuegos[3] = new Juego("Skyrim", 200, "Rol", "Bethesda");

		// 3. Entregar algunos Juegos y Series
		listaSeries[1].entregar();
		listaSeries[3].entregar();
		listaJuegos[0].entregar();
		listaJuegos[2].entregar();

		// 4. Contar cuántos hay entregados y devolverlos
		int seriesEntregadas = 0;
		int juegosEntregados = 0;

		for (int i = 0; i < listaSeries.length; i++) {
			if (listaSeries[i].isEntregado()) {
				seriesEntregadas++;
				listaSeries[i].devolver();
			}
			if (listaJuegos[i].isEntregado()) {
				juegosEntregados++;
				listaJuegos[i].devolver();
			}
		}

		System.out.println("Hay " + seriesEntregadas + " series entregadas.");
		System.out.println("Hay " + juegosEntregados + " juegos entregados.");
		System.out.println("----------------------------------------");

		// 5. Indicar el Juego con más horas y la Serie con más temporadas
		Serie serieMayor = listaSeries[0];
		Juego juegoMayor = listaJuegos[0];

		for (int i = 1; i < listaSeries.length; i++) {
			// Si el compareTo devuelve > 0, el objeto actual es mayor
			if (listaSeries[i].compareTo(serieMayor) > 0) {
				serieMayor = listaSeries[i];
			}
			if (listaJuegos[i].compareTo(juegoMayor) > 0) {
				juegoMayor = listaJuegos[i];
			}
		}

		System.out.println("La serie con más temporadas es:");
		System.out.println(serieMayor.toString());

		System.out.println("\nEl videojuego con más horas estimadas es:");
		System.out.println(juegoMayor.toString());
	}
}
