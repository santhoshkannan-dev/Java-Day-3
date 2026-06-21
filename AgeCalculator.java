import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentYear = 2026;
        int birthYear;

        System.out.print("Enter current year: ");
        currentYear = input.nextInt();

        System.out.print("Enter your birth year: ");
        birthYear = input.nextInt();

        int age = currentYear - birthYear;

        System.out.println("Your age is: " + age);
    }

}
