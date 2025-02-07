import java.time.*;
import java.util.Scanner;

public class ThirteenthFridayCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter a month (e.g., January, February, etc.): ");
        String monthName = scanner.next();
        scanner.close();

        try {
            Month month = Month.valueOf(monthName.toUpperCase());
            LocalDate date = LocalDate.of(year, month, 13);

            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println("The date " + date + " is a Friday the 13th!");
            } else {
                System.out.println("The date " + date + " is not a Friday the 13th.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month name. Please enter a valid month.");
        }
    }
}
