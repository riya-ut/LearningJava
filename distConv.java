class car {
    static float KmToMiles(float Km) {
        float miles = Km * 0.6213f;
        return miles;
    }

    static float milesToKilometer(float miles) {
        float Km = miles * 1.61f;
        return Km;
    }
}

public class distConv {
    public static void main(String[] args) {

        System.err.println(car.KmToMiles(5));

        System.err.println(car.milesToKilometer(7));
    }

}