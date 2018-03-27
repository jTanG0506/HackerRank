import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Solution {

  static boolean isAnagram(String a, String b) {
    if (a.length() != b.length())
      return false;

    a = a.toLowerCase();
    b = b.toLowerCase();

    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < a.length(); i++) {
      char letter = a.charAt(i);

      if (map.containsKey(letter)) {
        Integer freq = map.get(letter);
        map.put(letter, freq + 1);
      } else {
        map.put(letter, 1);
      }
    }

    for (int i = 0; i < b.length(); i++) {
      char letter = b.charAt(i);

      if (!map.containsKey(letter))
        return false;

      Integer freq = map.get(letter);

      if (freq == 0)
        return false;
      else
        map.put(letter, freq - 1);
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.next();
    String b = in.next();
    in.close();

    boolean ret = isAnagram(a, b);
    System.out.println(ret ? "Anagrams" : "Not Anagrams");
  }

}
