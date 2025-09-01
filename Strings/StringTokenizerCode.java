import java.util.StringTokenizer;

public class StringTokenizerCode {
    public static void main(String[] args) {
        String s = "Java is fun to learn";

        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();

        System.out.println(count);
    }
}
