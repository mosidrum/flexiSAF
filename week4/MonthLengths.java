import java.time.YearMonth;
import java.util.Scanner;

public class MonthLengths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        scanner.close();

        System.out.println("Month lengths for the year " + year + ":");

        for (int month = 1; month <= 12; month++) {
            YearMonth yearMonth = YearMonth.of(year, month);
            System.out.println(yearMonth.getMonth() + ": " + yearMonth.lengthOfMonth() + " days");
        }
    }
}
