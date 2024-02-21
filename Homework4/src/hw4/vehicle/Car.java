package hw4.vehicle;

public class Car  extends Vehicle{
    public Car(String brand, String make, long modelYear, double price, VehicleColor color, FuelType fuelType, double mileage, double mass, int cylinders, double gasTankCapacity, StartMechanism startType) {
        super(brand, make, modelYear, price, color, fuelType, mileage, mass, cylinders, gasTankCapacity, startType);
    }

    //Setting up my classes : Trey
    @Override
    public double calculateMaintenaceCost(double distance)
    {

        return distance * mass * (getCurrentYear()-modelYear) * cylinders * 0.0005; 
        
    }

     //Setting up my classes : Trey
    @Override
    public double calculateFuelEfficiency(double distance, double fuelPrice)
    {
        return cylinders * gasTankCapacity * fuelPrice / distance * 0.003;

    }

     //Setting up my classes : Trey
    @Override
    public abstract void startEngine()
    {
        
    }


}
