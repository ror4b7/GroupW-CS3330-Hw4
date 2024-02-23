package hw4.main;

import hw4.vehicleManager.VehicleManager;

public class Main {
		
	public static void main(String[] args) {
		// Instantiate vehicleManager, perform operations based on the requirements.
		VehicleManager vehicleManager = new VehicleManager();
		
		// Read vehicle data from the vehcileList.csv file and initialize objects.s
		vehicleManager.initializeStock();

		// Display all vehicle information.
		vehicleManager.displayAllVehicleInformation();
		
		// Display all car information.
		vehicleManager.displayAllCarInformation();
		
		//Display all truck information
		vehicleManager.displayAllTruckInformation();
		
		//Display all SUV information
		vehicleManager.displayAllSUVInformation();
		
		// Display all motorbike information.
		vehicleManager.displayAllMotorBikeInformation();
		
		// Display specific vehicle information.
		//vehicleManager.displayVehicleInformation(Vehicle v);
	}
	
}

