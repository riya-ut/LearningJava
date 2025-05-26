import java.util.Scanner;

interface Calculator {
    void add();

    void sub();
}

class MyCalculator1 implements Calculator {
    @Override
    public void add() {
        System.out.println("Addition from calculator 1");

    }

    @Override
    public void sub() {
        System.out.println("Subtraction from calculator 1");

    }

}

class MyCalculator2 implements Calculator {
    @Override
    public void add() {
        System.out.println("Addition from calculator 2");

    }

    @Override
    public void sub() {
        System.out.println("Subtraction from calculator 2");

    }

}

class MyCalculator3 implements Calculator {
    @Override
    public void add() {
        System.out.println("Addition from calculator 3");

    }

    @Override
    public void sub() {
        System.out.println("Subtraction from calculator 3");

    }

}

public class Inter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the choice\ncalculator1\ncalculator2\ncalculator3");
        String choice = scan.next();

        Calculator calc = Factory.getCalculator(choice);
        calc.add();
        calc.sub();
    }
}