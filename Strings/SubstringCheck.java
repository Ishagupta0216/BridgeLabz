public class SubstringCheck {
    public static boolean containsSubstring(String text, String pattern) {
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j;
            for (j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == pattern.length()) return true; 
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsSubstring("hello world", "java"));  
    }
}
