public class PalindromicNumberPattern {
    public static void main(String[] args) {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            // Print leading spaces to center the pattern
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            // Print descending numbers from row to 1
            for (int num = row; num >= 1; num--) {
                System.out.print(num);
            }

            // Print ascending numbers from 2 to row
            for (int num = 2; num <= row; num++) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}
