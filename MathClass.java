public class MathClass {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(Math.max(a, b));

		// The Math.min(x,y) method can be used to find the lowest value of x and y:
		System.out.println(Math.min(a, b));

		// The Math.sqrt(x) method returns the square root of x:
		int num = 16;
		System.out.println(Math.sqrt(num));

		// The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println(Math.abs(-4.7));


		// Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
		System.out.println(Math.random());
	}
}