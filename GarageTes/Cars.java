public class Cars extends Vehicle {
	//private variables made for the attributes for the cars
	private int seats;
	private String gearType; 
	
	public Cars(int id, String manufacturer, boolean isCars, boolean isMortorcycles, boolean isLorry, String gearType, int seats) { 
		super(id, manufacturer, true, false, false); 
		
		this.seats = seats; //variable made for the seats of the car
		this.gearType = gearType; //variable made for the gear type of the car
		
	} //end of the constructor
	
	public int getSeats() { 
		return seats; // will return the number of seats on the output
		
	}
	
	public String getGearType() { 
		return gearType; // will return the gear type used for the car
		
	}

}
