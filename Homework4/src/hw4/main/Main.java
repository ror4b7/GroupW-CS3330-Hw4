package hw4.main;

import hw4.vehicleManager.VehicleManager;

public class Main {
		
	public static void main(String[] args) {
		// Instantiate vehicleManager, perform operations based on the requirements.
		VehicleManager vehicleManager = VehicleManager.getInstance(); 
		
		// Read vehicle data from the vehcileList.csv file and initialize objects.s
		vehicleManager.initializeStock();

		// Display all vehicle information.
		System.out.println("All Vehicle Information:");
		vehicleManager.displayAllVehicleInformation();
		System.out.println("");
		
		// Display all car information.
		System.out.println("All Car Information:");
		vehicleManager.displayAllCarInformation();
		System.out.println("");
		
		//Display all truck information
		System.out.println("All Truck Information:");
		vehicleManager.displayAllTruckInformation();
		System.out.println("");
		
		//Display all SUV information
		System.out.println("All SUV Information:");
		vehicleManager.displayAllSUVInformation();
		System.out.println("");
		
		// Display all motorbike information.
		System.out.println("All Motorbike Information:");
		vehicleManager.displayAllMotorBikeInformation();
	
	}
	
}

