public class task8 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println(check(i, i + 1));
		System.out.println(check(1, 2));
		// loop that will produce an output 10 times
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
