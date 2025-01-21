import java.util.*;

public class NumberOperations {
    public static void performNumberOperations(Scanner scanner) {
    List<Integer> numberList = new ArrayList<>();

    System.out.println("\nNumber Operations: ");
    System.out.println("Add at least one number to the list to begin.");

    while (numberList.isEmpty()) {
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int initialNumber = scanner.nextInt();
            numberList.add(initialNumber);
            System.out.println("Number added!");
        } else {
            System.out.println("Invalid number! Please try again.");
            scanner.next();
        }
    }

    while (true) {
        System.out.println("\nChoose an operation:");
        System.out.println("1. Add number");
        System.out.println("2. Edit a number");
        System.out.println("3. Remove a number");
        System.out.println("4. View list");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Current list: " + numberList);
                    System.out.print("Enter number to add: ");
                    if (scanner.hasNextInt()) {
                        int toAdd = scanner.nextInt();
                        numberList.add(toAdd);
                        System.out.println("Number added.");
                    } else {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next();
                    }
                }
                case 2 -> {
                    System.out.println("Current list: " + numberList);
                    System.out.print("Enter index of number to edit (starting from 0): ");
                    if (scanner.hasNextInt()) {
                        int index = scanner.nextInt();
                        if (index >= 0 && index < numberList.size()) {
                            System.out.print("Enter replacing number: ");
                            if (scanner.hasNextInt()) {
                                int newNumber = scanner.nextInt();
                                numberList.set(index, newNumber);
                                System.out.println("Number updated.");
                            } else {
                                System.out.println("Invalid number. Please try again.");
                                scanner.next();
                            }
                        } else {
                            System.out.println("Invalid index. Please try again.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid index.");
                        scanner.next();
                    }
                }
                case 3 -> {
                    System.out.println("Current list: " + numberList);
                    System.out.print("Enter index of number to remove (starting from 0): ");
                    if (scanner.hasNextInt()) {
                        int index = scanner.nextInt();
                        if (index >= 0 && index < numberList.size()) {
                            numberList.remove(index);
                            System.out.println("Number removed.");
                        } else {
                            System.out.println("Invalid index. Please try again.");
                        }
                    } else {
                        System.out.println("Invalid input. Please enter a valid index.");
                        scanner.next();
                    }
                }
                case 4 -> System.out.println("Current list: " + numberList);
                case 5 -> {
                    System.out.println("Exiting number operations.");
                    return;
                }
                default -> System.out.println("Invalid choice! Please select a valid option.");
            }
        } else {
            System.out.println("Invalid input! Please enter a number.");
            scanner.next();
        }
    }
}
}