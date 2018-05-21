public class task6 {

	public static void main(String[] args) {
		System.out.println(check(4,5,true));
		System.out.println(check(5,5,false));
		// Add another parameter which is a boolean
	}

	static int check(int x, int y, boolean z) { 
		if(z==true) { 
			return x + y; 
			//If true will return the sum of both integers
		} else {
			return x * y; 
			//If it is not true it will return the two numbers multiplied
			
			
			
	} 
		
	}
}
