public class Factorial {
	public static void factorial(int num) {
		int fact = 1 ;
		for (int i = num; i >= 1; i--) {
			fact *= i ;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		int num = 5 ;
		factorial(num);
	}
}