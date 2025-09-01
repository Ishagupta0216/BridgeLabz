public class ToggleCase {
    public static void main(String[] args) {
        String s = "HeLLo WoRLd";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch); 
            }
        }

        System.out.println(sb.toString());
    }
}
