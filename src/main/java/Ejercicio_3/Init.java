package Ejercicio_3;

public class Init {
	public static void main(String[] args) {
		// Instanciación de vehículos con constructores completos
		Coche miCoche = new Coche("Rojo", "Civic", 25000.0, "Honda", 1500, "Gasolina", 5);
		Moto miMoto = new Moto("Negro", "Ninja", 8000.0, "Kawasaki", 600, "Gasolina", "Deportiva");
		Bicicleta miBici = new Bicicleta("Azul", "Marlin 7", 850.0, "Trek", "Aluminio", 21);
		Patinete miPatinete = new Patinete("Blanco", "A5 Lux", 120.0, "Razor", "Acero", 2);

		// Mostrar por pantalla
		System.out.println(miCoche.toString());
		System.out.println(miMoto.toString());
		System.out.println(miBici.toString());
		System.out.println(miPatinete.toString());
	}
}