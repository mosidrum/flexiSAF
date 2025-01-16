import java.util.*;

public class Generics {

    static int count = 0;

    static void check_even_odd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
            count+=1;
        } else {
            System.out.println(num + " is odd");
        }
    }

    static void check_prime(int num) {
        if (num <= 1 || (num % 2 == 0 && num != 2)) {
            System.out.println(num + " is not a prime number");
            return;
        }

        boolean prime_flag = false;

        for (int i = 3; i < num; i += 2) {
            if (num % i == 0) {
                prime_flag = true;
                count+=1;
                break;
            }
        }

        if (!prime_flag) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }

    static void check(int choice, int number) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1: check_even_odd(number);
                break;
            case 2: check_prime(number);
                break;
            default:
                System.out.println("Invalid choice");
                choice=sc.nextInt();
                check(choice, number);
        }
    }

    static void perform_number_operation() {
        int eachElement, n, choice;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) {
            eachElement=sc.nextInt();
            numbers.add(eachElement);
        }
        System.out.println("Enter the choice");
        System.out.println("1. Check Odd or Even numbers 2. Check for Prime numbers");
        choice=sc.nextInt();
        Iterator itr = numbers.iterator();
        count=0;
        while(itr.hasNext()) {
            check(choice, (int) itr.next());
        }
        if(choice==1) {
            System.out.println("The total even numbers are " + count);
            System.out.println("The total odd numbers are " + (numbers.size() - count));
        } else {
            System.out.println("The total Prime numbers are " + count);
            System.out.println("The total Non Prime numbers are " + (numbers.size() - count));
        }
    }

    static void check_for_palindrome(String str  ) {
        StringBuilder x1 = new StringBuilder(str);
        if(str.equals(x1.reverse().toString())) {
            System.out.println(str + " is a palindrome");
            count+=1;
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    static void perform_string_operation() {
        int n;
        String word;
        ArrayList<String> words = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            word = sc.next();
            words.add(word);
        }
        count = 0;
        for(String str : words) {
            check_for_palindrome(str);
        }
        System.out.println("Number of palindromes: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while(true) {
           System.out.println("Choose Input Type");
           System.out.println("1. Numbers 2. String 3.Exit Application");
           try {
               int userChoice = sc.nextInt();
               switch (userChoice) {
                   case 1:
                       perform_number_operation();
                       break;
                   case 2:
                       perform_string_operation();
                       break;
                   case 3:
                       System.out.println("Exiting program. Goodbye!");
                       return;
                   default:
                       System.out.println("Invalid Choice");
               }
           } catch (InputMismatchException e) {
               System.out.println("Invalid input! Please enter a valid number.");
               sc.nextLine();
           }
       }
    }
}