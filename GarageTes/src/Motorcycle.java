
public class Motorcycle extends Vehicle {

	
	private String fuelType = ""; 
	private int cc; 
	
	public Motorcycle(int id, String manufacturer, int cc, String fuelType, boolean isCars, boolean isMotorcycle, boolean isLorry) {
		super(id, manufacturer, false, true, false); 
		
		this.fuelType = fuelType; 
		this.cc = cc; 
		
	} 
	
	public String getFuelType() { 
		return fuelType; 
		
	}
	
	public double getCc() { 
		return cc; 
		
		
	}
}