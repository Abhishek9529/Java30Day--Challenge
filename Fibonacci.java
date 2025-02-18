public class Fibonacci {
	public static void  fabnacci(int num) {
		int a = 0, b = 1;
		System.out.print(0 + ", " + 1);
		for (int i = 3; i <= num; i++) {
			int fab = a + b;
			a = b ;
			b = fab ;
			System.out.print(", " + (fab));
		}
	}
	public static void main(String[] args) {
		fabnacci(5);
	}
}