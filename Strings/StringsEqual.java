public class StringsEqual{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "hello";

        if (s1.equals(s2)) {
            System.out.println("case sensitive");
        } else {
            System.out.println("Not sensitive");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("case insensitive");
        } else {
            System.out.println("Not case insensitive");
        }
    }
    }
