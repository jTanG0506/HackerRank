import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    s = s.trim();
    String[] tokens = s.split("[ .,?!\\_'@]+");

    if (s.equals("")) {
      System.out.println("0");
    } else if (s.length() > 400000) {
      return;
    } else {
      System.out.println(tokens.length);

      for (int i = 0; i < tokens.length; i++) {
        System.out.println(tokens[i]);
      }
    }
    
    scan.close();
  }

}
