public class Fibonacci {
	public static void  fibonacci(int num) {
		if (num == 1) {
			System.out.println(0);
		}
		if (num >= 2) {
			int a = 0, b = 1;
			System.out.print(0 + ", " + 1);
			if (num > 2) {
				for (int i = 2; i < num; i++) {
					int fab = a + b;
					a = b ;
					b = fab ;
					System.out.print(", " + (fab));
				}
			}
		}
	}
	public static void main(String[] args) {
		fibonacci(8);
	}
}
