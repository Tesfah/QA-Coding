
public class Lorry extends Vehicle {

	//private variable that will store the attributes for the Lorry
	private String variant = ""; 
	//inherited from the vehicle class
	public Lorry(int id, String manufacturer, String variant, boolean isCars, boolean isMotorcycle, boolean isLorry) {
		super(id, manufacturer, false, false, true); 
		this.variant = variant; 
		
	} //end of the constructor
	
	public String getVariantType() { 
		return variant; 
		
	}
}
