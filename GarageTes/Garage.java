import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.Random; 
import java.util.List; 




class Garage {

		public static List<Vehicle> vehicleList = new ArrayList<>(); //creating an array list to strore the vehicles
		
		private static void addVehicle(Vehicle v) { // this is a method used to add vehicles to the array list
			vehicleList.add(v); 
			
		}
		
		private static void removeVehicle(Vehicle v) { // this is a method used to remove vehicles from the array list
			vehicleList.remove(v); 
			
		}
		
		private static void removeVehicle(int id) { // the iterator function is used here to iterate through each vehicle 
			Iterator<Vehicle> i = vehicleList.iterator(); // this will iterate through the array list
			while (i.hasNext()) { 
					Vehicle vehi = (Vehicle) i.next(); 
					if (vehi.getID() == id) { 
						i.remove();
						
			}
	}
}

		private static float generateBill(Vehicle v) { 
			float total = 0.00f; 
			
			if (v.isCars())
					total = calculate("Car") + 15.00f; //this will generate the bill for the specific vehicle in this case a Car
			else if (v.isLorry())
					total = calculate("Lorry") + 15.00f; //this will generate the bill for the specific vehicle in this case a Lorry
			else 
					total = calculate("Motorcycle") + 15.00f; //this will generate the bill for the specific vehicle in this case a Motorcycle
			
			removeVehicle(v); //this will allow the vehicle to be removed once the bill has been generated for the vehicle 
			
			return total; // this will return the total bill calculated
			
		} 
		
		private static float calculate(String s) { // calculating the bill randomnly for each vehicle
			float value = 0.00f; 
			if (s.equals("Car")) { 
				Random random = new Random(); 
				value = ((400 - 60) * random.nextFloat() + 60); 
			}else if (s.equals("Lorry")) { 
				Random random = new Random(); 
				value = ((600 - 45) * random.nextFloat() + 45); 
			} else { 
					Random random = new Random(); 
					value = ((300 - 60) * random.nextFloat() + 60);
					
			} 
			
				return value; // will return the value of the bill when calculated
				
		} 
		
		
		public static void main(String[] args) { // main method created to put new vehicles
					Cars c1 = new Cars(1, "Audi", true, false, false, "Manual", 5); 
					Lorry l1 = new Lorry(3, "Ford", "18-wheeler", false, false, true); 
					Motorcycle m1 = new Motorcycle(5, "Harley", 600, "Petrol", false, true, false); 
				
					
					// this add vehicle will add the new vehicles to the array list 
					addVehicle(c1); 
					addVehicle(l1); 
					addVehicle(m1); 
					
					// this system out print method will print out the array list for the amount of vehicles in the garage 
					System.out.println("Current vehicles stored in the Garage:\n" + vehicleList + "\n\nBill Calculation (VAT inclucive):");
					
					// these system out print functions will allow the bill to be generated for the new vehicles, and also outputting the bill generated to two decimal places
					System.out.println("Total Bill for Audi:" + String.format("%,.2f", generateBill(c1)));
					System.out.println("Total Bill for Ford:" + String.format("%,.2f", generateBill(l1)));
					System.out.println("Total Bill for Harley:" + String.format("%,.2f, generateBill(m1)) + "\n\n");
					
							// this will print out the output once the vehicles have been billed and then removed from the array list
					System.out.println("Total vehicles present in the Garage:" + vehicleList);
					
		}
}
		
		
		

		