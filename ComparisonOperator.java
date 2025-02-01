
import java.util.Scanner;

public class ComparisonOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Speed Limit Check
        // System.out.println("Enter Car Speed : ");
        // int speed = sc.nextInt();
        // Using Ternary Operator
        // System.out.println(speed < 60 ? "Safe" : (speed <= 80 ? "Caution" : "Over
        // Speed"));

        // Using boolean data types
        // boolean isSafe = (speed < 60), isCaution = (speed >= 60 && speed <= 80),
        // isOverSpeed = (speed > 80);
        // System.out.println((isSafe ? "Safe" : (isCaution ? "Caution" : (isOverSpeed ?
        // "OverSpeed" : "high"))));

        // 2. Age Comparison for Competition
        // int age1 = 28, age2 = 45, age3 = 50;
        // check if age1 is youngest or not
        // System.out.println(age1 < age2 && age1 < age3 ? "Youngest" : "Not the
        // youngest");

        // 3. Discount Eligibility
        // int totalbill = 5500;
        // boolean isPremium = true ; // customer has premium membership
        // System.out.println(totalbill > 5000 && isPremium == true ? "Eligible" : " Not
        // Eligible" ); // check if bill greater then 5000 and he has premium member
        // then he visible for disscount

        // 4. Multiple of 3 and 5
        // int num = 7;
        // System.out.println((num % 3 == 0 && num % 5 == 0) ? "FizzBuss" : num % 3 == 0
        // ? "Fizz" : num % 5 == 0 ? "Buzz" : "Not divided by 3 and 5" );

        // 5. Voting System
        // int vot1 = 88, vot2 =90, vot3 = 24;
        // System.out.println((vot1 > vot2 || vot1 > vot3 )? "Vot1 in Leading" : "Vot1 is Not in Leading");
    }

}