public class Fibonacci {
	public static void  fibonacci(int num) {
		if (num == 0) {
			System.out.println("invalid number, number should be greater then 0");
			return;
		}
		if (num == 1) {
			System.out.println(0);
			return;
		}
		StringBuilder sb = new StringBuilder();
		int a = 0, b = 1;
    sb.append(a).append(",").append(b);
		for (int i = 2; i < num; i++) {
			int fab = a + b;
			a = b ;
			b = fab ;
			sb.append(",").append(fab);
		}
		System.out.print(sb.toString());
	}
	public static void main(String[] args) {
		fibonacci(2);
	}
}
