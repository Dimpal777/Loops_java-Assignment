import java.util.Scanner;

public class switchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gender (M/F):");
        String gender = scanner.next();

        switch (gender.toUpperCase()) {
            case "M":
                System.out.println("Gender: Male");
                break;
            case "F":
                System.out.println("Gender: Female");
                break;
            default:
                System.out.println("Invalid gender input.");
        }

        scanner.close();
    }
}