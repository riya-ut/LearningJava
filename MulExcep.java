import java.util.InputMismatchException;
import java.util.Scanner;

public class MulExcep {
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
            System.out.println("Enter the size of the array");
            int size = scan.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the element");
            int ele = scan.nextInt();
            System.out.println("Enter the index");
            int index = scan.nextInt();
            arr[index] = ele;
            arr = null;
            System.out.println(arr[index]);

        }

        catch (ArithmeticException ae) {
            System.out.println("Provide a non -zero denominator");
        } catch (NegativeArraySizeException nae) {
            System.out.println("Provide a +ve array size");
        } catch (InputMismatchException ime) {
            System.out.println("Provide only integers");
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Provide a valid index");
        } catch (Exception e) {
            System.out.println("Invalid input; try again");
        }
        System.out.println("Connection is terminated");
    }

}
