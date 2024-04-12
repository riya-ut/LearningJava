package myFirstProject;

public class TrianglePattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("&");
            }

            System.out.println();

        }

    }

}
