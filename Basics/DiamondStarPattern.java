public class DiamondStarPattern {
    public static void main(String[] args) {
        int size = 5;

        // Upper half of the diamond
        for (int row = 1; row <= size; row++) {
            // Print leading spaces
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            // Print stars for current row (odd count)
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half of the diamond
        for (int row = size - 1; row >= 1; row--) {
            // Print leading spaces
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            // Print stars descending (mirroring the upper half)
            for (int star = 1; star <= (2 * row) - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
