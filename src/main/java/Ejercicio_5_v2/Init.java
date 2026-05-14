package Ejercicio_5_v2;

public class Init {
	public static void main(String[] args) {
		Comanda c = new Comanda(1, 3);

		c.añadirPlato(new Postre("Flan", 5.0, 1, 2, false));
		c.añadirPlato(new Primero("Ensalada mixta", 10.0, 1, 0, true));
		c.añadirPlato(new Primero("Lomo ibérico", 20.0, 2, 0, false));
		c.añadirPlato(new Pescado("Lubina", 18.0, 1, 0));

		Carne solomillo = new Carne("Solomillo", 21.0, 0, 0);
		solomillo.añadirCarne("Al punto");
		c.añadirPlato(solomillo);

		System.out.println(c.toString());
	}
}