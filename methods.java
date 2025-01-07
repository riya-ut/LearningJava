class calculator {
    int a = 50;
    int b = 40;

    void add() {
        int c = a + b;
        System.out.println(c);
    }

}

class methods {
    public static void main(String[] args) {

        calculator calc = new calculator();
        calc.add();

    }

}
