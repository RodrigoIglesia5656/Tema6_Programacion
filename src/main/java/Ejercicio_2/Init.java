package Ejercicio_2;

public class Init {

	public static void main(String[] args) {
		Figura[] figuras = { new Cuadrado("Rojo", 5), new Circulo("Azul", 3), new Triangulo("Verde", 4, 6) };

		for (Figura f : figuras) {
			System.out.println("Figura de color: " + f.getColor());
			System.out.println("Área: " + f.calcularArea());
			System.out.println("Perímetro: " + f.calcularPerimetro());
			System.out.println("---------------------------");
		}
	}

}
