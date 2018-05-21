public class Vehicle {
		private boolean isCars; 
		private boolean isMotorcycle;    //All of the fields have been changed to private 
		private boolean isLorry; 
		
		//private variables which will store the attributes, manufacturer and the vehicle ID
		private String manufacturer = ""; 
		private int id; 
		
		//public variables made to for the vehicles and including the boolean methods to confirm which ever vehicle type
		
	public Vehicle(int id, String manufacturer, boolean isCars, boolean isMotorcycle, boolean isLorry) { 
		this.isCars = isCars; 
		this.isMotorcycle = isMotorcycle; 
		this.isLorry = isLorry; 
		this.manufacturer = manufacturer; 
		this.id = id; 
		
	} 
	
	public int getID() { 
		return id; 
		
	} 
	
	public String getManufacturer() { 
		return manufacturer; 
		
	} 
	
	public boolean isLorry() { 
		return isLorry; 
		
	} 
	
	public boolean isCars( ) { 
		return isCars; 
		
	}
	
	public boolean isMotorcycle() { 
		return isMotorcycle; 
		
	}
	
	
	public String toString() {  //overriding string to string method used to display the output as a string
			String vehicleType = ""; // will return te vehicle type
			if (this.isLorry())
				vehicleType = "Lorry"; 
			else if (this.isCars)
				vehicleType = "Car"; 
			else 
				vehicleType = "Motorcycle"; 
			
			return ("ID:" + this.getID() +", manufacturer:" + this.getManufacturer() +", Vehicle Type:" + vehicleType);  
			//what will be returned in the output
			
	}

	
	}
