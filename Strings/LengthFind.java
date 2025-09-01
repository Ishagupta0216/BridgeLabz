public class LengthFind {
    public static void main(String[] args) {
        String s = "Hello";
        int length = 0;

        try {
            while (true) {
                s.charAt(length); 
                length++;
            }
        } catch (Exception e) {
        }

        System.out.println(length);
    }
}
