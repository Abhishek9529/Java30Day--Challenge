import java.util.Scanner;
public class Main {
	
	static void calculate(int num1, int num2){
	   System.out.println("Addition : " + (num1 + num2) ) ;
	   System.out.println("Subtract : " + (num1 - num2) ) ;
	   System.out.println("Multiply : " + (num1 * num2) ) ;
	   System.out.println("Division : " + (num1 / num2) ) ;
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1st number : ");
	int num1 = sc.nextInt();	
        System.out.println("enter 2nd number : ");
	int num2 = sc.nextInt();
		calculate(num1, num2);
	}

}
