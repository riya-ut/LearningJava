public class intializeArray {
    public static void main(String[] args) {

        int[][] a = { { 10, 20, 40, 30, 50 }, { 40, 20, 10, 11, 97 }, { 11, 22, 33, 44, 55 } };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
