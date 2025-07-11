public class NumberTrianglePattern {
    public static void main(String[] args) {
        int size = 5;

        for (int row = 1; row <= size; row++) {
            // Print leading spaces to shape the triangle
            for (int space = 1; space <= size - row; space++) {
                System.out.print(" ");
            }

            // Print the current row number with spaces
            for (int col = 1; col <= row; col++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }
    }
}

