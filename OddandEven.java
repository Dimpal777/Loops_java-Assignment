public class OddandEven {
    public static void main(String[] args) {
        int start = 1; // Start of the range
        int end = 20; // End of the range

        System.out.println("Even numbers:");
        // Print even numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers:");
        // Print odd numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}