import java.util.Scanner;

public class floatArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        float[] a = new float[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextFloat();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        scan.close();
    }

}