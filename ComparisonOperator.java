
// 1. Speed Limit Check
import java.util.Scanner;

public class ComparisonOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car Speed : ");
        int speed = sc.nextInt();

        // Using Ternary Operator 
        System.out.println(speed < 60 ? "Safe" : (speed <= 80 ? "Caution" : "Over Speed"));

        // Using boolean data types 
        // boolean isSafe = (speed < 60), isCaution = (speed >= 60 && speed <= 80), isOverSpeed = (speed > 80);
        // System.out.println((isSafe ? "Safe" : (isCaution ? "Caution" : (isOverSpeed ? "OverSpeed" : "high"))));
    }
}