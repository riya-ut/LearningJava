class Calculation {
    int add(int a, int b) {
        int sum = a + b;
        return sum;

    }

    int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    float add(int a, float b) {
        float sum = a + b;
        return sum;
    }

    long add(long a, long b, long c) {
        long sum = a + b + c;
        return sum;
    }

    float add(long a, float b, long c) {
        float sum = a + b + c;
        return sum;
    }

    double add(double a, double b, double c) {
        double sum = a + b + c;
        return sum;
    }

    float add(int a, float b, long c) {
        float sum = a + b + c;
        return sum;
    }
}

class MethodOverloading {

    public static void main(String[] args) {

        Calculation calc = new Calculation();
        System.out.println(calc.add(20, 20, 10.3));
    }

} // it will check number of parameters
  // Datatype of parameters
  // and order of data types of parameters
