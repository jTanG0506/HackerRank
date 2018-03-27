import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int line = 1;
    while (in.hasNext()) {
      String str = in.nextLine();
      System.out.printf("%d %s\n", line, str);
      line++;
    }
  }

}
