package hw4.vehicleManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import hw4.vehicle.*;

public class VehicleManager {
	
	// Variables
	private static final VehicleManager INSTANCE = new VehicleManager(); // Instantiates the VehicleManager instance
    private ArrayList<Vehicle> vehicleList; 
    private final static String vehicleFilePath = "vehicleList.csv";
    private final static double distance = 300;
    private final static double fuelPrice = 3.25;
    
    // Initializes an instance of VehicleManager
    private VehicleManager() {
    	vehicleList = new ArrayList<Vehicle>();
    }
    
    // Provides the user with a way to get the instance 
    public static VehicleManager getInstance() {
        return INSTANCE;
    }
    
    
    // Don't think we need this one anymore after the assignment correction
//    public boolean readFromFile(String FileName) {
//    	
//    }
    
    
    // Initializes the vehicleList with vehicles from vehicleList.csv
    public boolean initializeStock() {
    	
        try {
            // Open the vehicleList.csv file for reading
            Scanner fileIn = new Scanner(new FileInputStream(vehicleFilePath));
            
            // Read through the file line by line
            while (fileIn.hasNextLine()) {
                String line = fileIn.nextLine();
                // Split each line into parts based on commas
                String[] tokens = line.split(",");
                
                // The first token indicates the type of vehicle
                String vehicleType = tokens[0];
                
                // Determine the vehicle type and create corresponding vehicle instance
                switch (vehicleType) {
                    case "Car":
                        // Create and add a new Car to vehicleList
                        vehicleList.add(new Car(tokens[1], tokens[2], Long.parseLong(tokens[3]), Double.parseDouble(tokens[4]), VehicleColor.valueOf(tokens[5].toUpperCase()), FuelType.valueOf(tokens[6].toUpperCase()), Double.parseDouble(tokens[7]), Double.parseDouble(tokens[8]),Integer.parseInt(tokens[9]),Double.parseDouble(tokens[10]), StartMechanism.valueOf(tokens[11])));
                        break;
                    case "Truck":
                        // Create and add a new Truck to vehicleList
                    	vehicleList.add(new Truck(tokens[1], tokens[2], Long.parseLong(tokens[3]), Double.parseDouble(tokens[4]), VehicleColor.valueOf(tokens[5].toUpperCase()), FuelType.valueOf(tokens[6].toUpperCase()), Double.parseDouble(tokens[7]), Double.parseDouble(tokens[8]),Integer.parseInt(tokens[9]),Double.parseDouble(tokens[10]), StartMechanism.valueOf(tokens[11])));
                        break;
                    case "SUV":
                        // Create and add a new  SUV to vehicleList
                    	vehicleList.add(new SUV(tokens[1], tokens[2], Long.parseLong(tokens[3]), Double.parseDouble(tokens[4]), VehicleColor.valueOf(tokens[5].toUpperCase()), FuelType.valueOf(tokens[6].toUpperCase()), Double.parseDouble(tokens[7]), Double.parseDouble(tokens[8]),Integer.parseInt(tokens[9]),Double.parseDouble(tokens[10]), StartMechanism.valueOf(tokens[11])));
                        break;
                    case "Motorbike":
                        // Create and add a new Motorbike to vehicleList
                    	vehicleList.add(new Motorbike(tokens[1], tokens[2], Long.parseLong(tokens[3]), Double.parseDouble(tokens[4]), VehicleColor.valueOf(tokens[5].toUpperCase()), FuelType.valueOf(tokens[6].toUpperCase()), Double.parseDouble(tokens[7]), Double.parseDouble(tokens[8]),Integer.parseInt(tokens[9]),Double.parseDouble(tokens[10]), StartMechanism.valueOf(tokens[11])));
                        break;
                }
            }
                        
            // Successfully initialized the stock, return true
            fileIn.close();
            return true;
        } catch (FileNotFoundException e) {
            // File not found, return false to indicate failure
            return false;
        }
    	
    }
    
    // Saves the vehicleList to vehicleList.csv
    public boolean saveVehicleList() {
    	
            String headerLine = null;

            // Read the header line from the file
            try (Scanner fileIn = new Scanner(new FileInputStream(vehicleFilePath))) {
                if (fileIn.hasNextLine()) {
                    headerLine = fileIn.nextLine(); // Read the first line (header)
                }
            } catch (FileNotFoundException e) {
                // 
                return false;
            }

            // overwrite the file
            try (PrintWriter fileOut = new PrintWriter(new FileOutputStream(vehicleFilePath, false))) {
                // just makes sure that the header is the first line in the file
            	if (headerLine != null) {
                    fileOut.println(headerLine); // Write the original header back
                }

                // Iterate over the vehicleList and write each item to the file
                for (Vehicle vehicle : vehicleList) {
                    String line = vehicle.toString();
                    fileOut.println(line);
                }
                
                return true; // Successfully saved the vehicleList
            } catch (IOException e) {
                return false; // An error occurred while writing to the file
            }
    }

    // checks to see if a vehicle is of a certain type
    private boolean isVehicleType(Vehicle v, Class clazz) {
    	if(v.getClass().equals(clazz)) {
    		return true;
    	}
    	return false;
    }
    
    // gets the number of vehicles of a certain type (class)
    public int getNumberOfVehiclesByType(Class clazz) {
        int count = 0;
        for (Vehicle v : vehicleList) {
            if (isVehicleType(v, clazz)) {
                count++;
            }
        }
        return count;
    }
    
    public void displayAllVehicleInformation(){
    	
    	//If vehicleList is empty, print an appropriate message
    	if (vehicleList.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
        
    	//Loop through vehicle List
        for (Vehicle vehicle : vehicleList) {
        	//Print the information of each vehicle
            System.out.println(vehicle.toString());
        }
    }
    
    public void displayAllCarInformation() {
    	
    	//If vehicleList is empty, print an appropriate message
    	if (vehicleList.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
    	
    	//Counter variable to track number of car instances
    	int i = 0; 
    	
    	//Loop through vehicle List
        for (Vehicle vehicle : vehicleList) {
        	//Print vehicle info and increment i if the vehicle is an instance of Car
        	if(vehicle instanceof Car){
        	i++;
            System.out.println(vehicle.toString());
        	}
        }
        
        //If there were no cars in the list, print an appropriate message
        if(i == 0) {
        	System.out.println("No Cars Were Found");
        }
    }
    
    public void displayAllTruckInformation() {
    	
    	//If vehicleList is empty, print an appropriate message
    	if (vehicleList.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
    	
    	//Counter variable to track number of Truck instances
    	int i = 0; 
    	
    	//Loop through vehicle List
        for (Vehicle vehicle : vehicleList) {
        	//Print vehicle info and increment i if the vehicle is an instance of Truck
        	if(vehicle instanceof Truck){
        	i++;
            System.out.println(vehicle.toString());
        	}
        }
        
        //If there were no Trucks in the list, print an appropriate message
        if(i == 0) {
        	System.out.println("No Trucks Were Found");
        }

    }
    
    public void displayAllSUVInformation(){
    	
    	//If vehicleList is empty, print an appropriate message
    	if (vehicleList.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
    	
    	//Counter variable to track number of SUV instances
    	int i = 0; 
    	
    	//Loop through vehicle List
        for (Vehicle vehicle : vehicleList) {
        	//Print vehicle info and increment i if the vehicle is an instance of SUV
        	if(vehicle instanceof SUV){
        	i++;
            System.out.println(vehicle.toString());
        	}
        }
        
        //If there were no SUVs in the list, print an appropriate message
        if(i == 0) {
        	System.out.println("No SUVs Were Found");
        }
    }
    
    public void displayAllMotorBikeInformation() {	
    	
    	//If vehicleList is empty, print an appropriate message
    	if (vehicleList.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
    	
    	//Counter variable to track number of Motorbike instances
    	int i = 0; 
    	
    	//Loop through vehicle List
        for (Vehicle vehicle : vehicleList) {
        	//Print vehicle info and increment i if the vehicle is an instance of Motorbike
        	if(vehicle instanceof Motorbike){
        	i++;
            System.out.println(vehicle.toString());
        	}
        }
        
        //If there were no Motorbikes in the list, print an appropriate message
        if(i == 0) {
        	System.out.println("No Motorbikes Were Found");
        }
    }
    
    public void displayVehicleInformation(Vehicle v){
    	//If given vehicle exists
    	if(vehicleList.contains(v)) {
    		//Print vehicle information
            System.out.println(v.toString());
    	}
    	
    	//If vehicle does not exist
    	else {
    		//Print error message
    		System.out.println("Vehicle not Found");
    	}
    }


    /*This function finds and returns the vehicle with the highest
     * maintenance cost of the vehicles listed within the given distance.
     * If multiple vehicles share the same cost, then one of them is 
     * randomly selected.
     */
    public Vehicle getVehicleWithHighestMaintenanceCost(double distance) {
        ArrayList<Vehicle> costVehicle = new ArrayList<Vehicle>();
        double cost = 0;
        for(Vehicle vehicle: vehicleList) {
            if(vehicle.calculateMaintenaceCost(distance)>cost) {
                cost = vehicle.calculateMaintenaceCost(distance);
                costVehicle = new ArrayList<Vehicle>();
                costVehicle.add(vehicle);
            }
            else if(vehicle.calculateMaintenaceCost(distance)==cost) {
                costVehicle.add(vehicle);
            }
        }

        Random random = new Random();
        int newRandom = random.nextInt(costVehicle.size());
        return costVehicle.get(newRandom);
    }


    /*This function returns the vehicle with the lowest maintenance cost
     *considering the given distance. If multiple vehicles share the lowest
     *cost, then one of them is randomly selected.
     */
    public Vehicle getVehicleWithLowestMaintenanceCost(double distance) {
        ArrayList<Vehicle> costVehicle = new ArrayList<Vehicle>();
        double cost = Integer.MAX_VALUE;
        for(Vehicle vehicle: vehicleList) {
            if(vehicle.calculateMaintenaceCost(distance)<cost) {
                cost = vehicle.calculateMaintenaceCost(distance);
                costVehicle = new ArrayList<Vehicle>();
                costVehicle.add(vehicle);
            }
            else if(vehicle.calculateMaintenaceCost(distance)==cost) {
                costVehicle.add(vehicle);
            }
        }

        Random random = new Random();
        int newRandom = random.nextInt(costVehicle.size());
        return costVehicle.get(newRandom);
    }

    /*This function returns the vehicle(s) with the greatest fuel efficiency considering
     * the given distance and fuel price. They are returned in the form of an ArrayList.
     */
    public ArrayList<Vehicle> getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice) {
        ArrayList<Vehicle> efficientVehicles = new ArrayList<Vehicle>();
        double efficiency = 0;

        for(Vehicle vehicle: vehicleList) {
            double newEfficiency = vehicle.calculateFuelEfficiency(distance, fuelPrice);
            if(newEfficiency>efficiency) {
                efficientVehicles = new ArrayList<Vehicle>();
                efficientVehicles.add(vehicle);
            }
            else if(newEfficiency==efficiency) {
                efficientVehicles.add(vehicle);
            }
        }

        return efficientVehicles;
    }
}
