class plane {
    void fly() {
        System.out.println("Plane is flying");
    }
}

class cargoPlane extends plane {
    void fly() {
        System.out.println("Cargo plane is flying at low height...");
    }

    void carryCargo() {
        System.out.println("CargoPlane is carying goods");
    }
}

class passengerPlane extends plane {
    void fly() {
        System.out.println("Passenger plane is flying at a medium height...");
    }

    void carryPassenger() {
        System.out.println("CargoPlane is carying passenger");
    }
}

class FighterPlane extends plane {
    void fly() {
        System.out.println("Fighter plane is flying at a greater height...");
    }

    void carryWeapons() {
        System.out.println("CargoPlane is carying Weapons");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        FighterPlane fp = new FighterPlane();

        plane ref;

        /*
         * ref = cp;
         * cp.fly();
         * 
         * ref = pp;
         * pp.fly();
         * 
         * ref = fp;
         * fp.fly();
         */
        ref = cp; // Upcasting
        ref.fly();
        ((cargoPlane) ref).carryCargo(); // downcasting

        ref = pp;
        ref.fly();
        ((passengerPlane) ref).carryPassenger();

        ref = fp;
        ref.fly();
        ((FighterPlane) ref).carryWeapons();
    }
}