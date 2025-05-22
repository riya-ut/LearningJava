import java.util.Scanner;

abstract class Shape {

    protected float area;

    abstract void acceptInput();

    abstract void calArea();

    void dispArea() {
        System.out.println("Area: " + area);
    }
}

class Square extends Shape {
    private float side;

    @Override
    void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side: ");
        side = scan.nextFloat();

    }

    @Override
    void calArea() {
        area = side * side;

    }

}

class Rectangle extends Shape {
    private float length;
    private float breadth;

    @Override
    void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = scan.nextFloat();
        System.out.println("Enter breadth: ");
        breadth = scan.nextFloat();

    }

    @Override
    void calArea() {
        area = length * breadth;

    }

}

class Circle extends Shape {

    private float radius;

    @Override
    void acceptInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius = scan.nextFloat();

    }

    @Override
    void calArea() {
        area = 3.14f * radius * radius;

    }

}

public class Abstaction {
    public static void main(String[] args) {

        // Circle c = new Circle();
        // c.acceptInput();
        // c.calArea();
        // c.dispArea();

        // Square s = new Square();
        // s.acceptInput();
        // s.calArea();
        // s.dispArea();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your choice:\n Square\n Rectangle\nCircle");
        String choice = scan.next();
        Shape shape = Factory.getShape(choice);

        shape.acceptInput();
        shape.calArea();
        shape.dispArea();

    }

}