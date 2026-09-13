import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] abc) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[101][101];
        int b[][] = new int[101][101];
        int c[][] = new int[101][101];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                sum = 0;
                for (int l = 0; l < m; l++) {
                    sum += a[i][l] * b[l][j];
                }
                c[i][j] = sum;
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
