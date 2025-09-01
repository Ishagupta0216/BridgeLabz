public class OnlyDigits {
    public static void main(String[] args) {
        String s = "1234s";

        boolean onlyDigits = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                onlyDigits = false;
                break;
            }
        }

        if (onlyDigits) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String not contains only digits ");
        }
    }
}
