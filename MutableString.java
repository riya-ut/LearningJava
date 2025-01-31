public class MutableString {

    public static void main(String[] args) {
        StringBuffer st = new StringBuffer();
        st.append("Java");
        System.out.println(st);

        st.append(" JavaScript");
        System.out.println(st);

        System.out.println(st.capacity());

        st.append(" James Gosling");
        System.out.println(st);

        System.out.println(st.capacity()); // To check the size of string buffer

        st.trimToSize(); // to remove reseve capacity
        System.out.println(st.capacity());

        st.delete(1, 10);
        System.out.println(st);

    }
}
