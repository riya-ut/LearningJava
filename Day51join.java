class Jooin extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Java");
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println();
            }
        }
    }
}

public class Day51join {
    public static void main(String[] args) throws Exception {
        System.out.println("Main thread started");
        Jooin d1 = new Jooin();
        d1.start();
        d1.join();
        System.out.println("Main thread completed");
    }

}