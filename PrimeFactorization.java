import java.util.*;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println(a / 2);
            return;
        }
        for (int i = 3; i <= a; i += 2) {
            if (a % i == 0) {
                System.out.println(a /
                     i);
                return;
            }
        }
    }
}
