package Ejercicio_3;

//Clase para vehículos manuales o de tracción humana
public class VehiculoSinMotor extends Vehiculo {
	protected String material;

	public VehiculoSinMotor(String color, String modelo, double precio, String marca, String material) {
		super(color, modelo, precio, marca);
		this.material = material;
	}
}
