public class GCD {
    public static int  findGCD(int a, int b) {
        int gcf = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                for (int j = 1; j <= b; j++) {
                    if (b % j == 0) {
                        if (i == j) {
                            gcf = j;
                        }
                    }
                }
            }
        }
        return gcf;
    }

    public static void main(String[] args) {
        int a = 20, b = 5, gcd = 0;
        if (a == b || b == a) {
            System.out.println(a);
            return;
        }
        if (a == 1 || b == 1) {
            System.out.println(1);
            return;
        }
        if (a == (b - 1) || b == (a - 1)) {
            System.out.println(1);
            return;
        }
        gcd = findGCD(a, b);
        System.out.println(gcd);
    }
}