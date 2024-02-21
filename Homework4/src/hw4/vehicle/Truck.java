package hw4.vehicle;

public class Truck  extends Vehicle

{
    public Truck(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
        super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
    }

    
    @Override
    public double calculateMaintenaceCost(double distance)
    {

        return distance * mass * (getCurrentYear()-modelYear) * cylinders * 0.002; 

    }
    //Setting up my classes : Trey
    @Override
    public double calculateFuelEfficiency(double distance, double fuelPrice)
    {
        return cylinders * gasTankCapacity * fuelPrice / distance * 0.1; 
        
    }

    //Setting up my classes : Trey
    @Override
    public void startEngine()
    {
        
    }
}
