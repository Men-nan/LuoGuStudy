import java.util.*;

public class Load_bearingCapacityEstimate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        float num = (a * b - c * d) / (float)(b - d);
        System.out.printf("%.2f", num);
    }
}
