
import java.util.Scanner;

public class UserTwoDarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of classes");
        int n = scan.nextInt();

        System.out.println("Enter the number of Students");
        int m = scan.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.println(" Enter the age of Class " + i + " Student " + j);

                a[i][j] = scan.nextInt();
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(a[i][j] + " ");
            }

            System.out.println();

        }

    }

}
