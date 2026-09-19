import java.util.*;

public class TruePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean k = false;
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isPrime(getReverseOrder(i))) {
                if (k) System.out.print(",");
                System.out.print(i);
                k = true;
            }
        }
        if (!k) System.out.print("No");
    }

    public static boolean isPrime(int a) {
        if (a <= 1) return false;
        if (a == 2 || a == 3) return true;
        if (a % 2 == 0 || a % 3 == 0) return false;
        for (int i = 5; i <= a / i; i += 6) {
            if (a % i == 0 || a % (i + 2) == 0) return false;
        }
        return true;
    }

    public static int getReverseOrder(int a) {
        int reverse = 0;
        while (a > 0) {
            int digit = a % 10;
            reverse = reverse * 10 + digit;
            a /= 10;
        }
        return reverse;
    }
}
