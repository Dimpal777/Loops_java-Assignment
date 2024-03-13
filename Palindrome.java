import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = sc.nextLine();
        
        if(isPalindrome(input))
            System.out.println("This string is a palindrome.");
        else
            System.out.println("This string is not a palindrome.");
        
        sc.close();
    }
    
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
