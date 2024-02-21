package hw4.vehicleManager;
import java.util.ArrayList;
import hw4.vehicle.*;;

public class VehicleManager {

    private ArrayList<Vehicle> vehicleList; 
    private String vehicleFilePath; 



    //Sorry Kailtyn I needed to type something so I can make the fueEfficency function - Trey 
    private boolean isVehicleType(Vehicle v, Class clazz)
    {

            return true; 
    }



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

    



    //Gets the average of fuel efficencty by averaging gas tank capcity and cylinder and then running the equation
    public double getAverageFuelEfficiencyOfSUVs(double distance, double fuelPrice)
    {

        //Find average cylinder
        //find average gas tank capcity 
        double cylinder = 0;
        double gasTankCapacity = 0; 
        int count = 0; 

        for (Vehicle cur : vehicleList)
        {
            if (isVehicleType(cur, cur.getClass()))
            {

                cylinder += cur.getCylinder(); 
                gasTankCapacity += cur.getGasTankCapcity; 
                count += 1; 
            }
        }


        if (count == 0)
        {
            return -1.0; 
        }

        else 
        {
            return (cylinder / count) * (gasTankCapacity / count) * fuelPrice / distance * 0.05;
        }
        
        
    }

    



}
