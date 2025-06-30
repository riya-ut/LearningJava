
//Achieving multi threading by implementing runnable interface
import java.util.Scanner;

class add implements Runnable {

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

class charPrinting implements Runnable {

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

class printNum implements Runnable {

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

class day47runninter {
    public static void main(String[] args) throws Exception {
        add d1 = new add();
        charPrinting d2 = new charPrinting();
        printNum d3 = new printNum();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.start();
        t2.start();
        t3.start();
    }
}