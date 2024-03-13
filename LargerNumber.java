public class LargerNumber{
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 20.3;
        double num3 = 15.8;

        // Assuming num1 is the largest initially
        double largestNumber = num1;

        // Check if num2 is larger than current largestNumber
        if (num2 > largestNumber) {
            largestNumber = num2;
        }

        // Check if num3 is larger than current largestNumber
        if (num3 > largestNumber) {
            largestNumber = num3;
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}