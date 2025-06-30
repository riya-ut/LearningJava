class Eclipse implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();

        if (name.equals("TYPE")) {
            codeType();
        } else if (name.equals("COMPLETE")) {
            codeComplete();
        } else {
            autoSave();
        }

    }

    void codeType() {
        System.out.println("Typing task started");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Typing....");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Typing task ended");
    }

    void codeComplete() {
        System.out.println("Code completion task started");
        for (;;) {
            System.out.println("Code completed....");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    void autoSave() {
        System.out.println("AutoSaving task started");
        for (;;) {
            System.out.println("Saving....");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

public class day49Thread {
    public static void main(String[] args) {
        Eclipse e = new Eclipse();

        Thread t1 = new Thread(e);
        Thread t2 = new Thread(e);
        Thread t3 = new Thread(e);

        t1.setName("TYPE");
        t2.setName("COMPLETE");
        t3.setName("SAVE");

        t2.setDaemon(true); // creating Demon Thread
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}
