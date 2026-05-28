import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidateNumber {
    public static void main(String[] args) {
        // O try-with-resources garante que o scanner seja fechado automaticamente
        try (Scanner scanner = new Scanner(System.in)) {
            validateNumber(scanner);
        }
    }

    public static void validateNumber(Scanner scanner) {
        System.out.println("\n--- NUMBER VALIDATOR ---");
        System.out.print("Enter a number: ");
        
        try {
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.printf("%d is positive%n", number);
            } else if (number < 0) {
                System.out.printf("%d is negative%n", number);
            } else {
                System.out.printf("%d is zero (neither positive nor negative)%n", number);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter a valid integer.");
        }
    }
}
