import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupWords(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); 

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art"};
        System.out.println(groupWords(words));
    }
}
