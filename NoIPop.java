class calculator {
    int a = 50;
    int b = 40;

    int add() {
        int c = a + b;
        return c;
    }

}

class MyTask {
    void printSquarePatern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

class NoIPop {
    public static void main(String[] args) {

        MyTask obj = new MyTask();
        obj.printSquarePatern(5);

    }

}
