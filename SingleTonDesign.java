// For a particular class only one object has to be created

class Ton {
    static Ton t = new Ton();

    static int count;
    {
        count++;
    }

    private Ton() {

    }

    public static Ton getObject() {
        return t;
    }

    void fun() {
        System.out.println("Inside fun()");
    }
}

public class SingleTonDesign {
    public static void main(String[] args) {
        Ton t1 = Ton.getObject();
        t1.fun();
        Ton t2 = Ton.getObject();
        t2.fun();
        Ton t3 = Ton.getObject();
        t3.fun();

        System.out.println(Ton.count);

    }
}
