
public class Lorry extends Vehicle {

	
	private String variant = ""; 
	
	public Lorry(int id, String manufacturer, String variant, boolean isCars, boolean isMotorcycle, boolean isLorry) {
		super(id, manufacturer, false, false, true); 
		this.variant = variant; 
		
	} 
	
	public String getVariantType() { 
		return variant; 
		
	}
}
