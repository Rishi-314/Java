import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**************Check your voting Eligibility**************");
        System.out.print("Enter your Age: ");
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to Vote");
        } else {
            System.out.println("You are not eligible to Vote");
        }
    }
}
