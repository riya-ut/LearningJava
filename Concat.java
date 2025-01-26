public class Concat {

    public static void main(String[] args) {
        String s1 = "RIYA";
        System.out.println(s1);

        String s2 = s1.concat("ARJUN");
        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1.concat("ARJUN");
        System.out.println(s3);

        System.out.println(s2 == s3);

        s1 = s1.concat("ARJUN");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
    }
}
