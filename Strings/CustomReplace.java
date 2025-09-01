public class CustomReplace {
    public static String customReplace(String text, char oldChar, char newChar) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (ch == oldChar) {
                sb.append(newChar);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(customReplace("banana", 'a', 'o')); 
    }
}
