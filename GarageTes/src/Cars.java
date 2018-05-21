public class Cars extends Vehicle {
	
	private int seats;
	private String gearType; 
	
	public Cars(int id, String manufacturer, boolean isCars, boolean isMortorcycles, boolean isLorry, String gearType, int seats) { 
		super(id, manufacturer, true, false, false); 
		
		this.seats = seats; 
		this.gearType = gearType; 
		
	}
	
	public int getSeats() { 
		return seats; 
		
	}
	
	public String getGearType() { 
		return gearType; 
		
	}

}
