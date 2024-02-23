package hw4.vehicle;

public class Truck  extends Vehicle

{
    public Truck(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
        super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
    }

    //Setting up my classes : Trey
    @Override
    public abstract double calculateMaintenanceCost(double distance)
    {
    }
    //Setting up my classes : Trey
    @Override
    public abstract double calculateFuelEfficiency(double distance, double fuelPrice)
    {
    }

    //Setting up my classes : Trey
    @Override
    public abstract void startEngine()
    {
    }
    
    // Truck Specific toString
	@Override
	public String toString() {
		return "Truck," + brand + "," + make + "," + modelYear + "," + price
				+ "," + color + "," + fuelType + "," + mileage + "," + mass
				+ "," + cylinders + "," + gasTankCapacity + "," + startType;
	}
}
