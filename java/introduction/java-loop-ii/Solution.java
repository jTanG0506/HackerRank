import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int q = in.nextInt();

    for (int i = 0; i < q; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();

      int current = a;
      for (int j = 0; j < n; j++) {
        int pow = (int) Math.pow(2, j);
        current += pow * b;
        System.out.printf("%d ", current);
      }
      System.out.println();
    }

    in.close();
  }

}
