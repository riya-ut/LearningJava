import java.util.Scanner;

class plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }

    void fly() {
        System.out.println("Plane is flying");
    }

    void land() {
        System.out.println("Plane is landing");
    }

}

class cargoPlane extends plane {

    @Override
    void takeOff() {
        System.out.println("Cargo plane is taking off...");
    }

    @Override
    void fly() {
        System.out.println("Cargo plane is flying at low height...");
    }

    @Override
    void land() {
        System.out.println("Cargo plane is landing...");
    }

}

class passengerPlane extends plane {
    @Override
    void takeOff() {
        System.out.println("Passenger plane is taking off...");
    }

    void fly() {
        System.out.println("Passenger plane is flying at a medium height...");
    }

    @Override
    void land() {
        System.out.println("Passenger plane is landing...");
    }

}

class FighterPlane extends plane {

    @Override
    void takeOff() {
        System.out.println("Flighter plane is taking off...");
    }

    void fly() {
        System.out.println("Fighter plane is flying at a greater height...");
    }

    @Override
    void land() {
        System.out.println("Flighter plane is landing...");
    }

}

class Factory {
    public static Shape getShape(String choice) {
        if (choice.equalsIgnoreCase("square")) {
            return new Square();
        } else if (choice.equalsIgnoreCase("rectangle")) {
            return new Rectangle();

        } else if (choice.equalsIgnoreCase("circle")) {
            return new Circle();

        } else {
            return null;
        }
    }

    static plane getPlane(String choice) {
        if (choice.equalsIgnoreCase("cargoPlane")) {
            return new cargoPlane();
        } else if (choice.equalsIgnoreCase("passengerPlane")) {
            return new passengerPlane();

        } else if (choice.equalsIgnoreCase("FighterPplane")) {
            return new FighterPlane();

        } else {
            return null;
        }
    }
}

public class polymorphysm2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choice\nCargoPlane\nPassengerPlane\nFighterPlane");
        String choice = scan.next();
        plane p = Factory.getPlane(choice);

        p.takeOff();
        p.fly();
        p.land();

    }
}
