import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Divion of Numbers");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();

        System.out.print("Enter the divisor: ");
        int div = scan.nextInt();

        try {
            System.out.println("The division is " + num / div);
        } catch (Exception e) {
            System.out.print("Undefined error");
        }
    }
}
