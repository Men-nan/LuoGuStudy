import java.util.*;

public class TheSumAndProductOfPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                int s = i * (num - i);
                if (s > sum) {
                    sum = s;
                }
            }
        }
        System.out.println(sum);
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
}
