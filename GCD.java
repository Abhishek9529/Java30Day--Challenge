public class GCD {
	public static int  findGCD(int a, int b) {
		int gcf = 1;
		for (int i = 1; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				gcf = i;
			}
		}
		return gcf;
	}

	public static void main(String[] args) {
		int a = 12, b = 12, gcd = 0;
		gcd = findGCD(a, b);
		System.out.println(gcd);
	}
}
