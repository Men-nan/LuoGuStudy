import java.util.*;

public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 -1; k++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
