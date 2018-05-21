
public class task11 {

		public static void main(String[] args) {
			
			int[] array = new int [10]; 
			for (int i = 0; i < 10; i++) {
					array[i] = i; 
					// Loop that populates the array
					System.out.println(check(array[i], i*2)); 
					System.out.println(check((array[i])*10, (i*2)*10));  
					  // time values by 10
			}
		}
		
		static int check(int x, int y) {
			if (x > 0 && y > 0) {
				return x + y;
			} else if (x == 0) {
				return y;
			} else {
				return x;
			}
		}

	}
