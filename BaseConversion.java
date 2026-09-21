import java.util.*;

public class BaseConversion {
    static char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static char[] anser = new char[100];
    static int index = 0;
    public static void main(String[] arge) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int base = sc.nextInt();
        convertToBase(num, base);
        System.out.print(anser);
    }

    public static void convertToBase(int num, int base) {
        if (num < base) {
            anser[index++] = digits[num];
        }
        else {
            convertToBase(num / base, base);
            anser[index++] = digits[num % base];
        }
    }
}
