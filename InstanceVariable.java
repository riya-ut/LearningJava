class Variable {
    int a;
    float b;
    boolean c;

}

class InstanceVariable {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.a = 100;
        v.b = 45.5f;
        v.c = true;
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(v.c);
    }

}
