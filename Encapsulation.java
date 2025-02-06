
class Customer {
    private String name;
    private int cin;
    private float balance;

    public void setName(String nm) {
        name = nm;
    }

    public void setCin(int c) {
        cin = c;
    }

    public void setBalance(float bal) {
        if (bal > 0) {
            balance = bal;
        }

    }

    public String getName() {
        return name;
    }

    public int getCin() {
        return cin;
    }

    public float getBalance() {
        return balance;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        // c1.name = "Arjun";
        c1.setName("Arjun");
        // c1.cin = 1001;
        c1.setCin(10001);
        // c1.balance = 10000;
        c1.setBalance(1000);

        System.out.println(c1.getName());
        System.out.println(c1.getCin());
        System.out.println(c1.getBalance());

    }

}
