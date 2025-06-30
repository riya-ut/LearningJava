
class user extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("user thread executing");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Some problem occured");
            }
        }
        System.out.println("User thread completed");
    }
}

class daemoon extends Thread {
    public void run() {
        for (;;) {
            System.out.println("Daemon thread executing");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Some problem occured");
            }
        }
    }
}

public class day49 {
    public static void main(String[] args) {
        System.out.println("Main() stareted execution");
        user d1 = new user();
        daemoon d2 = new daemoon();

        d2.setDaemon(true);

        d1.start();
        d2.start();

        System.out.println("Main() completed execution");

    }
}
