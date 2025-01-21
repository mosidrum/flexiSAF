import java.util.*;

public class NumberListSorter {

    public static void performSortOperation(Scanner scanner) {
        List<Integer> numberList = new ArrayList<>();

        System.out.print("How many numbers do you want to add to the list? ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
        }
        int count = scanner.nextInt();

        System.out.println("\nEnter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            numberList.add(scanner.nextInt());
        }

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Sort in ascending order");
            System.out.println("2. Sort in descending order");
            System.out.println("3. View current list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        Collections.sort(numberList);
                        System.out.println("Ascending order: " + numberList);
                    }
                    case 2 -> {
                        Collections.sort(numberList, Collections.reverseOrder());
                        System.out.println("Descending order: " + numberList);
                    }
                    case 3 -> System.out.println("List: " + numberList);
                    case 4 -> {
                        System.out.println("Exiting the program. Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }
    }
}
