public class ASCIIvaluefind {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println("ASCII Value");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);       
            int ascii = (int) ch;        
            System.out.println(ch + " : " + ascii);
        }
    }
}
