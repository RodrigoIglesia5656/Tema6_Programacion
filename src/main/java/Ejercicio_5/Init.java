package Ejercicio_5;

public class Init {
	public static void main(String[] args) {
		// Inicializamos la comanda indicando el número de mesa y los comensales
		Comanda mesa1 = new Comanda(1, 4);

		// Añadimos platos de las diferentes categorías
		mesa1.añadirPlato(new Primero("Sopa de Ajo", 8.50, false));
		mesa1.añadirPlato(new Carne("Chuletón", 24.00, "Poco hecho"));
		mesa1.añadirPlato(new Pescado("Dorada al horno", 18.00));

		// Añadimos un postre con azúcar y otro sin azúcar
		mesa1.añadirPlato(new Postre("Tarta de queso", 6.00, true));
		mesa1.añadirPlato(new Postre("Yogur natural", 3.50, false));

		
		System.out.println(mesa1.toString());

		boolean hayDiabeticos = mesa1.hayDiabeticosEnLaMesa();
		System.out.println("¿Se han pedido postres para diabéticos (sin azúcar)?: " + (hayDiabeticos ? "Sí" : "No"));
	}
}