package myFirstProject;

public class squareNumberPattern {
    public static void main(String[] args) {
        int count = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (count < 10) {
                    System.out.print(0);
                }
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }

}
