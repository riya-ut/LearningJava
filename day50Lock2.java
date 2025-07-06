class Priinter implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.println(name + " is executing the first line");
            Thread.sleep(3000);
            System.out.println(name + " is executing second line");
            Thread.sleep(3000);
            System.out.println(name + " is executing third line");
            Thread.sleep(3000);
            synchronized (this) {
                System.out.println(name + " is executing the fourth line");
                Thread.sleep(3000);
                System.out.println(name + " is executing fifth line");
                Thread.sleep(3000);
            }
            System.out.println(name + " is executing the sixth line");
            Thread.sleep(3000);
            System.out.println(name + " is executing seventh line");
            Thread.sleep(3000);
            System.out.println(name + " is executing eighth line");
            Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("Some problem occured");
        }
    }
}

class day50Lock2 {

    public static void main(String[] args) {
        Priinter p = new Priinter();
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        t1.setName("one");
        t2.setName("Two");
        t1.start();
        t2.start();

    }
}