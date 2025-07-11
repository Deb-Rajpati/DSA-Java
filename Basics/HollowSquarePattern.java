public class HollowSquarePattern {
    public static void main(String[] args) {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            // Print leading spaces to center the square
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            // Print stars and spaces to form hollow square border
            for (int col = 1; col <= size; col++) {
                if (row == 1 || row == size || col == 1 || col == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
