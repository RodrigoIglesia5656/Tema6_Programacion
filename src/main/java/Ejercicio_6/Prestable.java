package Ejercicio_6;

public interface Prestable extends Comparable<Object> {
    void entregar();
    void devolver();
    boolean isEntregado();
}