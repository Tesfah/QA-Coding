import java.util.ArrayList; 
import java.util.Iterator; 
import java.util.Random; 
import java.util.List; 




class Garage {

		public static List<Vehicle> vehicleList = new ArrayList<>();
		
		private static void addVehicle(Vehicle v) { 
			vehicleList.add(v); 
			
		}
		
		private static void removeVehicle(Vehicle v) { 
			vehicleList.remove(v); 
			
		}
		
		private static void removeVehicle(int id) { 
			Iterator<Vehicle> i = vehicleList.iterator(); 
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
					total = calculate("Car") + 15.00f; 
			else if (v.isLorry())
					total = calculate("Lorry") + 15.00f; 
			else 
					total = calculate("Motorcycle") + 15.00f; 
			
			removeVehicle(v); 
			
			return total; 
			
		} 
		
		private static float calculate(String s) { 
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
			
				return value; 
				
		} 
		
		
		public static void main(String[] args) { 
					Cars c1 = new Cars(1, "Audi", true, false, false, "Manual", 5); 
					Lorry l1 = new Lorry(3, "Ford", "18-wheeler", false, false, true); 
					Motorcycle m1 = new Motorcycle(5, "Harley", 600, "Petrol", false, true, false); 
				
					
					
					addVehicle(c1); 
					addVehicle(l1); 
					addVehicle(m1); 
					
					System.out.println("Current vehicles stored in the Garage:\n" + vehicleList + "\n\nBill Calculation (VAT inclucive):");
					
					System.out.println("Total Bill for Audi:" + generateBill(c1));
					System.out.println("Total Bill for Ford:" + generateBill(l1));
					System.out.println("Total Bill for Harley:" + generateBill(m1) + "\n\n");
					
					System.out.println("Total vehicles present in the Garage:" + vehicleList);
					
		}
}
		
		
		

		