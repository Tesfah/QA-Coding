public class task9 {

	public static void main(String[] args) {
		// task 10
		int[] array = new int [10]; 
		for (int i = 0; i < 10; i++) {
				array[i] = i; 
				// loop that will iterate through array
				System.out.println(check(array[i],i*2)); 
		}
		
	}
	
	static int check(int x, int y) {
		if (x > 0 && y > 0) {
			return x + y;
		} else if (x == 0) {
			return y; 
			// returns the value of y
		} else {
			return x; 
			// returns the value of x
		}
	}

} 
