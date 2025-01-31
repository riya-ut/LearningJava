import java.util.Scanner;

public class StringIP {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // string s = san.next();
        String s = scan.nextLine();
        System.out.println(s);

        StringBuffer st = new StringBuffer(s);
        System.out.println(st);

        scan.close();

    }

}
