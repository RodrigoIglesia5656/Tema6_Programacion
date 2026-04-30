package Ejercicio_3;

//Clase para vehículos que usan combustible
public class VehiculoMotor extends Vehiculo {
	protected int cilindrada;
	protected String combustible;

	public VehiculoMotor(String color, String modelo, double precio, String marca, int cilindrada, String combustible) {
		super(color, modelo, precio, marca);
		this.cilindrada = cilindrada;
		this.combustible = combustible;
	}
}
