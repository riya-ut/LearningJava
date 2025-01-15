import java.util.Scanner;

public class UserArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of student ");
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the value of " + i);
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

    }
}