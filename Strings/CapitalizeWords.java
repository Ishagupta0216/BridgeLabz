public class CapitalizeWords {
    public static void main(String[] args) {
        String s = "hello world";
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                String cap = word.substring(0, 1).toUpperCase() + word.substring(1);
                result = result + cap + " ";
            }
        }

        System.out.println(result);
    }
}
