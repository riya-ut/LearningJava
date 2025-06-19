
//Program of handling exception by using try-catch, throw, throws and finally;
import java.util.Scanner;

class throwDivision {
    void fun2() throws ArithmeticException {
        System.out.println("Connection 2 is Estd");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the numerator");
            int a = scan.nextInt();
            System.out.println("Enter the denominator");
            int b = scan.nextInt();
            int c = a / b;
            System.out.println();

        }

        catch (Exception e) {
            System.out.println("Handled inside fun2()");
            throw e;
        } finally {
            System.out.println("Connection 2 is Terminated");
        }
    }
}

public class ExcThrow {
    public static void main(String[] args) {
        System.out.println("Connection 1 is Estd");
        try {
            Demo2 d2 = new Demo2();
            d2.fun2();
        } catch (Exception e) {
            System.out.println("Handled inside main()");
        }
        System.out.println("Connection 1 is Terminated");
    }

}