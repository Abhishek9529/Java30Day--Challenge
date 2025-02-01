

// Q. Find All Prime Numbers in a Range
// Take two numbers as input and print all prime numbers between them.

import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int firstNumber = checkNumber(sc, "Enter 1st Number : ");
        if (firstNumber == -1)
            return;

        int secondNumber = checkNumber(sc, "Enter 2nd Number : ");
        if (secondNumber == -1) return;

        int primeCount = checkPrime(firstNumber, secondNumber);
        System.out.println("Total Prime Number : " + primeCount);
        System.out.println("Between  " + firstNumber + " To " + secondNumber);

    }

    private static int checkNumber(Scanner sc, String prompt) {
        System.out.println(prompt);
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number >= 1) {
                return number;
            } else {
                System.out.println("Enter the number must be greater then 1 ");
                return -1;
            }
        }
        System.out.println("Enter the valid number ");
        sc.next();
        return -1;
    }

    // check prime number
    private static int checkPrime(int firstNumber, int secondNumber) {
        int count = 0;
        System.out.println("this function check both " + firstNumber + " And " + secondNumber);
        for (int i = firstNumber; i <= secondNumber; i++) {
           count += checkEachNumber(i);
        }
        return count;
    }

    private static int checkEachNumber(int number) {
       if (number < 2) {
        System.out.println("if block 1 (num == 1) NonPrime : " + number);
        return 0;
       }
       if (number == 2) {
        System.out.println("if block 2 (num == 2) PrimeNum : "+ number);
        return 1;
       }
       if (number % 2 == 0) {
        System.out.println("if block 3 (even) NonPrime : " + number);
        return 0;
       }
        for (int j = 3; j <= Math.sqrt(number); j +=2) {
            if (number % j == 0) {
                System.out.println("for block NonPrime : " + number);
                return 0;
            }
        }
        System.out.println("last return PrimeNum : " + number);
        return 1;
    }
}
