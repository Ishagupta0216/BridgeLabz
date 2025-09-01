import java.util.*;

public class CustomSplit {
    public static String[] customSplit(String str, char delimiter) {
        List<String> result = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == delimiter) {
                result.add(temp.toString());
                temp.setLength(0);
            } else {
                temp.append(ch);
            }
        }
        result.add(temp.toString()); 
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String text = "apple,banana,grape";
        String[] parts = customSplit(text, ',');
        for (String s : parts) {
            System.out.println(s);
        }
    }
}
