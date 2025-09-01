public class RemoveDigits {
    public static void main(String[] args) {
        String s = "Hello123";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}
