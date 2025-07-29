import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Days: ");
        int Num = input.nextInt();
        System.out.print("Total Money saved in " + Num + " days: ");
        System.out.println((Num * (Num + 1)) / 2);
    }
}
