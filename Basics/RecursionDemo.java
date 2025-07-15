public class RecursionDemo {

    public static void recursiveCall(int count) {
        if (count == 0) {
            System.out.println("Reached base case. Returning...");
            return;
        }

        System.out.println("Calling function with count: " + count);
        recursiveCall(count - 1);
        System.out.println("Returning from call with count: " + count);
    }

    public static void main(String[] args) {
        int start = 3;
        recursiveCall(start);
    }
}

