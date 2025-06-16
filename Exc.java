import java.util.Scanner;

public class Exc {
    public static void main(String[] args) {
        System.out.println("Connection is Estd");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(" Enter the numerator: ");
            int a = scan.nextInt();
            System.out.println(" Enter the denominator: ");
            int b = scan.nextInt();
            int c = a / b;
            System.out.println(" The answer is: " + c);
        } catch (Exception e) {
            System.out.println(" Provide non-zero denominator");
        }
        System.out.println("Connection is terminated");

    }
}