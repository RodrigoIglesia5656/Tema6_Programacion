package Ejercicio_3;


public class Init {
	public static void main(String[] args) {
		// Creamos instancias de las clases concretas
		// Nota: Los datos se pasan hacia arriba por los constructores (super)
		Coche miCoche = new Coche("Negro", "Civic", 25000, "Honda", 2000, "Gasolina", 5);
		Moto miMoto = new Moto("Rojo", "Ninja", 12000, "Kawasaki", 600, "Gasolina", "Deportiva");
		Bicicleta miBici = new Bicicleta("Azul", "Rockhopper", 800, "Specialized", "Aluminio", 21);
		Patinete miPatinete = new Patinete("Gris", "Pro 2", 400, "Xiaomi", "Acero", 2);

		// Guardamos todo en una lista de tipo Vehiculo (Polimorfismo)
		Vehiculo[] flota = { miCoche, miMoto, miBici, miPatinete };

		System.out.println("--- LISTADO DE VEHÍCULOS ---");

		for (Vehiculo v : flota) {
			// Usamos los getters porque los atributos son private
			System.out.println("Marca: " + v.getMarca());
			System.out.println("Modelo: " + v.getModelo());
			System.out.println("Precio: " + v.getPrecio() + "€");

			// Comprobación de tipo para mostrar datos específicos
			if (v instanceof Coche) {
				System.out.println("Tipo: Coche (con motor)");
			} else if (v instanceof Bicicleta) {
				System.out.println("Tipo: Bicicleta (sin motor)");
			}

			System.out.println("---------------------------");
		}
	}
}
