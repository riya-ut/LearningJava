abstract class Bird {
    abstract void eat();

    abstract void fly();
}

abstract class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle is flying in the sky");
    }
}

class SerpentEagle extends Eagle {

    @Override
    void eat() {
        System.out.println("Serpent eagle is eating sepent...");
    }
}

class GoldenEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("GoldenEagle is eating Biriyani...");
    }

}

public class Abstraction3 {
    public static void main(String[] args) {
        SerpentEagle e = new SerpentEagle();
        e.fly();
        e.eat();

    }

}
