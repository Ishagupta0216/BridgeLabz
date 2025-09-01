public class ReverseWord {
    public static void main(String[] args) {
        String s = "Hi my name is Ishika";
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            result += rev + " ";
        }

        System.out.println(result);
    }
}
