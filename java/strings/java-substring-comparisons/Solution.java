import java.util.Scanner;

public class Solution {

  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    smallest = s.substring(0, k);
    largest = s.substring(0, k);

    String s2;
    for (int i = 1; i < s.length() - k + 1; i++) {
      s2 = s.substring(i, i + k);
      if (s2.compareTo(smallest) < 0)
        smallest = s2;
      if (s2.compareTo(largest) > 0)
        largest = s2;
    }

    return smallest + "\n" + largest;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();
    int k = in.nextInt();
    in.close();

    System.out.println(getSmallestAndLargest(s, k));
  }

}
