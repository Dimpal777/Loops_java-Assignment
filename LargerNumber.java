public class LargerNumber{
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 20.3;
        double num3 = 15.8;

        double largestNumber = num1;
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
