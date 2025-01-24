public class CompareString {

    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = new String("JAVA");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}