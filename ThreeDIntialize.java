public class ThreeDIntialize {

    public static void main(String[] args) {

        int[][][] a = { { { 1, 2, 3, 6 }, { 1, 2, 3, 7 } }, { { 1, 8, 6, 4, }, { 4, 7, 9, 2 } } };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
