Overview: This is an implementation of a vehicle showroom management system using Java Object-Oriented Programming principles. Different classes have been created for different types of vehicles. Additionally, a singleton Vehicle Manager class is used to manage the vehicle information.

Instructions to run program:

1. Clone/fork project to local machine
2. Import the HW2 folder into your eclipse IDE
3. Run the Main.java file

Trey:
  - Set up Vehicle Class and subclasses with there functions
  - public boolean removeVehicle(Vehicle vehicle)
  - public boolean addVehicle(Vehicle vehicle)
  - public double getAverageFuelEfficiencyOfSUVs(double distance,
    double fuelPrice)
    
Rachel:
  - public void displayAllCarInformation()
  - public void displayAllTruckInformation()
  - public void displayAllSUVInformation()
  - public void displayAllMotorbikeInformation()
  - public void displayVehicleInformation(Vehicle v)
  - public void displayAllVehicleInformation()

Katelyn:
  - Enums
  - public Vehicle getVehicleWithHighestMaintenanceCost(double distance)
  - public Vehicle getVehicleWithLowestMaintenanceCost(double distance)
  - public ArrayList<Vehicle> getVehicleWithHighestFuelEfficiency(double distance, double fuelPrice)
  - public ArrayList<Vehicle> getVehicleWithLowestFuelEfficiency(double distance, double fuelPrice)

Justice: 
  - Set up vehicle manager class
  - public boolean initializeStock()
  - public boolean saveVehicleList()
  - private boolean isVehicleType(Vehicle v, Class clazz)
  - public int getNumberOfVehichlesByType(Class clazz)
