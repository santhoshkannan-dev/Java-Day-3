import java.util.Scanner;

public class SimpleIntCal {
    public static void main(String[] args) {
        final double DEFAULT_RATE = 5.0;
        double principal, rate, time;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        principal = input.nextDouble();
        System.out.print("Enter time in years: ");
        time = input.nextDouble();
        System.out.print("Enter rate of interest: ");
        rate = input.nextDouble();
        if (rate == 0)
        rate = DEFAULT_RATE;

        double SI = (principal * rate * time) / 100;
        System.out.println("Interest = " + SI);
    }
}