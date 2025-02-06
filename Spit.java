
public class Spit {

    public static void main(String[] args) {
        String s = "India is my county I speak Hindhi";
        String[] ar = s.split("i");
        {
            for (int i = 0; i < ar.length; i++)
                System.out.println(ar[i]);
        }
    }

}
