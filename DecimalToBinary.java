import java.util.*;

public class DecimalToBinary {
    static char[] result = new char[100];
    static int index = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        convertToBase(num);
        System.out.print(result);
    }

    public static void convertToBase(int num) {
        if (num < 2) {
            result[index++] = Integer.toString(num).charAt(0);
        }
        else {
            convertToBase(num / 2);
            result[index++] = Integer.toString(num % 2).charAt(0);
        }
    }
}