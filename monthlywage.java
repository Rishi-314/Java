import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your hourly rate: ");
        double hourlyrate = scanner.nextDouble();

        System.out.print("Enter yout work hours / day: ");
        double hoursday = scanner.nextDouble();

        System.out.print("Enter your working days / month: ");
        int workingday = scanner.nextInt();

        double dailyearnings = hourlyrate * hoursday;
        double monthlyearnings = dailyearnings * workingdays;

        System.out.println("Monthly Earnings: ₹" + monthlyearnings);
    }
}
