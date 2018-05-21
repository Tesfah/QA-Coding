
public class Motorcycle extends Vehicle {

	//private variables that will store the attributes for the motorcycle
	
	private String fuelType = ""; 
	private int cc; 
	//inherited from the vehicle class
	public Motorcycle(int id, String manufacturer, int cc, String fuelType, boolean isCars, boolean isMotorcycle, boolean isLorry) {
		super(id, manufacturer, false, true, false); 
		
		this.fuelType = fuelType; //variable made for the fuel type of the motorcycle
		this.cc = cc; //variable made for the cc of the motorcycle
		
	} //end of the constructor
	
	public String getFuelType() { 
		return fuelType; 
		
	}
	
	public double getCc() { 
		return cc; 
		
		
	}
}