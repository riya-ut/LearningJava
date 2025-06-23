import java.util.Scanner;

class add extends Thread {
    @Override
    public void run() {
        System.out.println("Addition task started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st num");
        int a = scan.nextInt();
        System.out.println("Enter the 2nd num");
        int b = scan.nextInt();
        System.out.println(a + b);
        System.out.println("Addition Task Ended");
    }

}

class charPrinting extends Thread {
    @Override
    public void run() {
        System.out.println("Print char task started");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("print char Task Ended");
    }

}

class printNum extends Thread {
    @Override
    public void run() {
        System.out.println("Print num task Started");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("print num Task Ended");
        }
    }
}

public class MultiThreading47 {
    public static void main(String[] args) {
        add d1 = new add();
        charPrinting d2 = new charPrinting();
        printNum d3 = new printNum();

        d1.start();
        d2.start();
        d3.start();

    }
}
