import java.util.Scanner;
public class ToggleBtn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isOn = false;

		while (true) {
			System.out.println(" Enter a number 0 = exit or 1 = toggle btn : ");
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println(" exiting...");
				break;
			} else if (num == 1) {
				isOn = !isOn;
				System.out.println(isOn ? "ON " : "OFF");

			} else {
				System.out.println("Enter a number 1 = exit or 1= on ");

			}
			sc.close();
		}
		
	}
}