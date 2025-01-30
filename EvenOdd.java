import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		if (num > 0 && num % 2 == 0) {
			System.out.println(num + " : is an positive number and also is a even number ");
		}

		else if (num == 0) {
			System.out.println(num + " :  is zero ");
		}

		else if (num < 0) {
			System.out.println(num + " : is negtive number ");
		}

		else {
			System.out.println(num + " : is odd number ");
		}
	}
}