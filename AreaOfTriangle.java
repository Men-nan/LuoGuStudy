import java.util.*;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double sideA = Math.hypot(c - a, d - b);
        double sideB = Math.hypot(e - a, f - b);
        double sideC = Math.hypot(e - c, f - d);
        double p = (sideA + sideB + sideC) / 2;
        System.out.printf("%.2f", Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)));
    }
}