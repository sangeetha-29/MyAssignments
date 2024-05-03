package assignments.week1day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		for (int i = 0; i < 8; i++) {
			System.out.println(a);
			int f = a + b;
			a = b;
			b = f;
			
		}
	}
}


