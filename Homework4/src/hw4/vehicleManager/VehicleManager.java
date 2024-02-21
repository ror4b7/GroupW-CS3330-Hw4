package hw4.vehicleManager;
import java.util.ArrayList;
import hw4.vehicle.*;;

public class VehicleManager {

    private ArrayList<Vehicle> vehicleList; 
    private String vehicleFilePath; 



    //removes the first instance of the vehcial provided
    //Returns false if none are found
    public boolean removeVehicle(Vehicle vehicle)
    {
        boolean end = false; 

        int curIndex = 0; 

        while (end == false)
        {

            if (curIndex == vehicleList.size() - 1)
            {
                return false; 
            }

            if (vehicleList.get(curIndex).equals(vehicle))
            {
                break; 
            }

            curIndex += 1; 
        }

        vehicleList.remove(curIndex); 

        return true; 
       

    }

    public boolean addVehicle(Vehicle vehicle)
    {
        try
        {

        vehicleList.add(vehicle); 
        return true; 
        }
        catch (Exception e)
        {
            return false; 
        }

    }

    public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice)
    {

    }

    



}
