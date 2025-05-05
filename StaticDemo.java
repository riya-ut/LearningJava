
/*
 * A Java class can have:
 * 
 * Static variables
 * Static blocks
 * Static methods
 * Instance variables
 * Instance blocks
 * Instance methods
 * Constructors
 */
class Test {
    static int a, b;

    static {
        System.out.println("Inside static bock");
        a = 10;
        b = 20;
    }

    static void fun() {
        System.out.println(" Inside static method");
    }

    int x, y;
    {
        System.out.println("Inside instance block");
    }

    void fun2() {
        System.out.println("Inside instance method");
    }

    Test() {
        System.out.println("Inside constructor");
        x = 30;
        y = 40;
    }

    class StaticDemo {
        public static void main(String[] args) {
            Test.fun();
            Test t = new Test();
            t.fun2();
        }
    }
}
