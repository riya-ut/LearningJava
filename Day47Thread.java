public class Day47Thread {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println(t);

        t.setName("Tap");
        t.setPriority(8);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
    }
}