// This programs checks if a number is negative or positive
import java.util.*;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
        sc.close();
    }
}