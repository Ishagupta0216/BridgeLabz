public class ValidShuffle {
    public static boolean isShuffle(String s1, String s2, String result) {
        if (s1.length() + s2.length() != result.length()) return false;

        int i = 0, j = 0, k = 0;
        while (k < result.length()) {
            if (i < s1.length() && s1.charAt(i) == result.charAt(k)) {
                i++;
            } else if (j < s2.length() && s2.charAt(j) == result.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isShuffle("abc", "def", "adbcef")); 
        
    }
}
