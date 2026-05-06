package Ejercicio_3;

public abstract class VehiculoSinMotor extends Vehiculo {
	private String material;

	public VehiculoSinMotor(String color, String modelo, double precio, String marca, String material) {
		super(color, modelo, precio, marca);
		this.material = material;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return super.toString() + ", Material: " + material;
	}
}