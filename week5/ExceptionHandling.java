import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);

            System.out.print("Enter top number: ");
            int numerator = scanner.nextInt();
            System.out.print("Enter bottom number: ");
            int denominator = scanner.nextInt();
            System.out.println("Result: " + divideNumbers(numerator, denominator));

            scanner.nextLine();
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            processName(name);

            int[] numbers = {10, 20, 30, 40, 50};
            System.out.print("Enter an index (0-4): ");
            int index = scanner.nextInt();
            accessArrayIndex(numbers, index);

        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: Cannot divide by zero.");
        } catch (NullPointerException e) {
            System.out.println("Caught Exception: Name cannot be empty.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Index out of bounds.");
        } catch (InputMismatchException e) {
            System.out.println("Caught Exception: Invalid input type.");
        } finally {
            System.out.println("Execution complete.");
            scanner.close();
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is too low to proceed.");
        }
        System.out.println("Age verification passed.");
    }

    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return a / b;
    }

    public static void processName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException("Name cannot be empty.");
        }
        System.out.println("Welcome, " + name);
    }

    public static void accessArrayIndex(int[] arr, int index) {
        System.out.println("Accessing array element: " + arr[index]);
    }
}
