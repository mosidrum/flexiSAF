import java.util.*;

public class StringOperations {
    public static void performStringOperations(Scanner scanner) {
    List<String> stringList = new ArrayList<>();

    System.out.println("\nString Operations:");
    System.out.println("Add at least one string to the list to begin.");

    while (stringList.isEmpty()) {
        System.out.println("Enter a string to add:");
        String initialString = scanner.nextLine();
        stringList.add(initialString);
        System.out.println("String added!");
    }

    while (true) {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Add string to list");
        System.out.println("2. Edit a string");
        System.out.println("3. Remove a string");
        System.out.println("4. View list");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> {
                System.out.println("Current list: " + stringList);
                System.out.print("Enter string to add: ");
                String stringToAdd = scanner.nextLine();
                stringList.add(stringToAdd);
                System.out.println("String added!");
            }
            case 2 -> {
                System.out.println("Current list: " + stringList);
                System.out.print("Enter index of string to edit (starting from 0): ");
                int index = scanner.nextInt();
                scanner.nextLine();
                if (index >= 0 && index < stringList.size()) {
                    System.out.print("Enter replacing string: ");
                    String newString = scanner.nextLine();
                    stringList.set(index, newString);
                    System.out.println("String updated!");
                } else {
                    System.out.println("Invalid index!");
                }
            }
            case 3 -> {
                System.out.println("Current list: " + stringList);
                System.out.print("Enter index of string to remove (starting from 0): ");
                int index = scanner.nextInt();
                scanner.nextLine();
                if (index >= 0 && index < stringList.size()) {
                    stringList.remove(index);
                    System.out.println("String removed!");
                } else {
                    System.out.println("Invalid index!");
                }
            }
            case 4 -> {
                System.out.println("Current list: " + stringList);
            }
            case 5 -> {
                System.out.println("Exiting string operations.");
                return;
            }
            default -> System.out.println("Invalid choice!");
        }
    }
}
}