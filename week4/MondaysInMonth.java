import java.time.*;
import java.util.Scanner;

public class MondaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month (e.g., January, February, etc.): ");
        String monthName = scanner.nextLine().trim();
        scanner.close();

        try {
            Month month = Month.valueOf(monthName.toUpperCase());
            YearMonth yearMonth = YearMonth.of(Year.now().getValue(), month);
            LocalDate date = yearMonth.atDay(1);
            int count = 0;

            System.out.println("Mondays in " + month + " " + Year.now().getValue() + ":");

            while (date.getMonth() == month) {
                if (date.getDayOfWeek() == DayOfWeek.MONDAY) {
                    System.out.println(date);
                    count++;
                }
                date = date.plusDays(1);
            }

            System.out.println("Total Mondays: " + count + " Mondays");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid month name. Please enter a valid month.");
        }
    }
}
