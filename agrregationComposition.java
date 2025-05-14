import java.security.spec.MGF1ParameterSpec;

class mobile {
    Charger charger;
    Os os;

    public mobile() {
        os = new Os("android", 512);

    }

    void setCharger(Charger charger) {
        this.charger = charger;
    }

}

class Charger {
    String brand;
    int voltage;

    public Charger(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;

    }
}

class Os {
    String name;
    int size;

    public Os(String name, int size) {
        this.name = name;
        this.size = size;
    }

}

public class agrregationComposition {
    public static void main(String[] args) {
        mobile myMobile = new mobile();
        Charger myCharger = new Charger("mi", 12);
        myMobile.setCharger(myCharger);

        System.out.println(myMobile.charger.brand);
        System.out.println(myMobile.charger.voltage);

        System.out.println(myMobile.os.name);
        System.out.println(myMobile.os.size);

        myMobile = null;
    }
}
