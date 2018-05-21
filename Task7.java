public class Task7 {

	public static void main(String[] args) {
		System.out.println(check(1,0));
		System.out.println(check(1,2));
		
		// Parameters containing the integers
	}

	static int check(int x, int y) { 
		if(x>0 && y>0) { 
			return x + y; 
		} else if(x==0) { 
				return y; 
		}else { 
			return x; 
			//if statement stating if one number is 0 the other value is returned
			}
		}
	}