public class Vehicle {
		private boolean isCars; 
		private boolean isMotorcycle; 
		private boolean isLorry; 
		
		private String manufacturer = ""; 
		private int id; 
		
		
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
	
	
	public String toString() { 
			String vehicleType = ""; 
			if (this.isLorry())
				vehicleType = "Lorry"; 
			else if (this.isCars)
				vehicleType = "Car"; 
			else 
				vehicleType = "Motorcycle"; 
			
			return ("ID:" + this.getID() +", manufacturer:" + this.getManufacturer() +", Vehicle Type:" + vehicleType);  
			
			
	}

	
	}
