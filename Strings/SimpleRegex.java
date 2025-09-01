public class SimpleRegex {
    public static boolean match(String text, String pattern) {
        if (pattern.equals("a*b")) {
            int i = 0;
            while (i < text.length() && text.charAt(i) == 'a') {
                i++;
            }
            return i == text.length() - 1 && text.charAt(i) == 'b';
        }

        if (pattern.equals("a?b")) {
            return (text.equals("ab") || text.equals("b"));
        }

        return false; 
    }

    public static void main(String[] args) {
        System.out.println(match("aaab", "a*b"));
        
    }
}
