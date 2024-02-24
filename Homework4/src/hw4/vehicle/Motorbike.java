package hw4.vehicle;

public class Motorbike extends Vehicle {

    public Motorbike(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
        super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
    }


    @Override
    public double calculateMaintenaceCost(double distance)
    {
        return distance * mass * (getCurrentYear()-modelYear) * cylinders * 0.0002; 
        
    }

     //Setting up my classes : Trey
    @Override
    public  double calculateFuelEfficiency(double distance, double fuelPrice)
    {

        return cylinders * gasTankCapacity * fuelPrice / distance * 0.001; 
        
    }

     //Setting up my classes : Trey
    @Override
    public void startEngine()
    {
        System.out.println(StartMechanism.KICKSTART);
    }
    
    // Motorbike specific toString
	@Override
	public String toString() {
		return "Motorbike," + brand + "," + make + "," + modelYear + "," + price
				+ "," + color + "," + fuelType + "," + mileage + "," + mass
				+ "," + cylinders + "," + gasTankCapacity + "," + startType;
	}
    


}
