import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();

    boolean palindrome = true;
    int length = s.length();
    for (int i = 0; i < length / 2; i++) {
      if (s.charAt(i) != s.charAt(length - i - 1)) {
        palindrome = false;
        break;
      }
    }

    System.out.println(palindrome ? "Yes" : "No");
  }

}
