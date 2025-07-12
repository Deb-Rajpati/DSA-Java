import java.util.Scanner;

public class AverageCalculator {

    public static int calculateAverage(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int average = calculateAverage(num1, num2, num3);
        System.out.println("Average: " + average);

        scanner.close();
    }
}

