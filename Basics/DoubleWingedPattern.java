import java.util.Scanner;

public class DoubleWingedPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        // Upper half of the pattern
        for (int i = 1; i <= size; i++) {
            // Left spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 4 * (size - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half of the pattern
        for (int i = size; i >= 1; i--) {
            // Left spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 4 * (size - i); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
