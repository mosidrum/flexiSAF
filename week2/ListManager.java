import java.util.*;

public class ListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("\nListManager Operations:");
        System.out.println("1. String Operations");
        System.out.println("2. Number Operations");
        System.out.println("3. Sort a number list");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    StringOperations.performStringOperations(scanner);
                } else if (choice == 2) {
                    NumberOperations.performNumberOperations(scanner);
                } else if (choice == 3) {
                    NumberListSorter.performSortOperation(scanner);
                } else if (choice == 4) {
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }

}