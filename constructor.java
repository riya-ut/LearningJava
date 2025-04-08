class Customer {
    private int cID;
    private String cName;
    private long cNum;

    public Customer(int cID, String cName, long cNum) {
        this.cID = cID;
        this.cName = cName;
        this.cNum = cNum;
    }

    public int getcID() {
        return cID;
    }

    public String getName() {
        return cName;
    }

    public long getNum() {
        return cNum;
    }

}

class constructor {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Arjun", 6238070948L);
        System.out.println(c1.getcID());
        System.out.println(c1.getName());
        System.out.println(c1.getNum());

    }

}
