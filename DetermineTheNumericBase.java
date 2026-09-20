import java.util.*;

public class DetermineTheNumericBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(getBase(a, b, c));
    }

    public static int getBase(int a, int b, int c) {
        long prod = (long) a * b;
        long cVal = (long) c;
        int base = 0;
        if (prod == cVal) base = 10;
        for (int i = 2; i <= 16; i++) {
            if (i == 10 && base == 10) return base;
            long va = convertToBase(a, i);
            long vb = convertToBase(b, i);
            long vc = convertToBase(c, i);
            if (va >= 0 && vb >= 0 && vc >= 0 && va * vb == vc) {
                base = i;
                break;
            }
        }
        return base;
    }

    public static long convertToBase(int num, int base) {
        long result = 0;
        long power = 1;
        while (num > 0) {
            int digit = num % 10;
            if (digit >= base) {
                return -1;
            }
            result += digit * power;
            num /= 10;
            power *= base;
        }
        return result;
    }
}
