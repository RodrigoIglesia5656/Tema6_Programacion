package Ejercicio_2;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    // Métodos abstractos: cada figura los calculará de forma distinta
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getColor() {
        return color;
    }
}