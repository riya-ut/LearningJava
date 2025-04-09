class Customer {
    private int cID;
    private String cName;
    private Long cNum;

    public Customer() {
        cID = 1;
        cName = "Arjun";
        cNum = 9935752890L;
    }

    public Customer(int cID, String cName, Long cNum) {
        this();
        this.cID = cID;
        this.cName = cName;
        this.cNum = cNum;

    }

    public int getId() {
        return cID;
    }

    public String getName() {
        return cName;
    }

    public Long getNum() {
        return cNum;
    }
}

public class MultipleConstuctor {
    public static void main(String[] args) {
        Customer c1 = new Customer(2, "Riya", 8532579809L);

        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getNum());

    }
}
