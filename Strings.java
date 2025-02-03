
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Strings are used for storing text.
    // A String variable contains a collection of characters surrounded by double quotes:
    System.out.println("Enter Your Name : ");
    String name = sc.nextLine();
    // String name = "abhi";
    System.out.print("Hello " + name);

    // Length()
    System.out.println("Length : " + name.length());
    }
}
