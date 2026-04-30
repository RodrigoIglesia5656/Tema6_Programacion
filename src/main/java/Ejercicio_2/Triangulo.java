package Ejercicio_2;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Asumiendo un triángulo equilátero para el ejemplo
        return 3 * base;
    }
}