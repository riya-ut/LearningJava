class Family implements Runnable {
    String resource1 = "Controller";
    String resource2 = "playstation";

    public void run() {
        String name = Thread.currentThread().getName();
        if (name.equals("Riya") == true) {
            riyaAccquiredResource();
        }

        else {
            remoAccquiredResource();
        }
    }

    private void remoAccquiredResource() {
        synchronized (resource1) {
            try {
                System.out.println("Remo accquired Controller");
                Thread.sleep(1000);
                synchronized (resource2) {
                    System.out.println("remo accquired playstation");
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.err.println("Remo failed");
            }
        }
    }

    private void riyaAccquiredResource() {
        synchronized (resource1) {
            try {
                System.out.println("Riya accquired Controller");
                Thread.sleep(1000);
                synchronized (resource2) {
                    System.out.println("riya accquired playstation");
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.err.println("Riya failed");
            }
        }
    }
}

public class Day51DeadLock {
    public static void main(String[] args) {
        Family f = new Family();
        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);
        t1.setName("Riya");
        t2.setName("Remo");
        t1.start();
        t2.start();
    }
}
