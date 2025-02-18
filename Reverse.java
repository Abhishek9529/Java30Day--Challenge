
public class Reverse {
    public static String reverseNumber(int num) {
        String rev = "";
        int lastDigit;
        while (num > 0) {
            lastDigit = num % 10;
            rev += lastDigit;
            num = num / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 123;
        String revNumber = reverseNumber(num);
        System.out.println(revNumber);
    }
}
