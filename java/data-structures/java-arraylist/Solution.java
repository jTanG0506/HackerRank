import java.util.Scanner;
import java.util.ArrayList;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

    // Read in the first n lines.
    for (int i = 0; i < n; i++) {
      int k = in.nextInt();

      ArrayList<Integer> thisList = new ArrayList<Integer>();
      for (int j = 0; j < k; j++) {
        thisList.add(in.nextInt());
      }

      list.add(thisList);
    }

    int q = in.nextInt();

    // Deal with the queries.
    for (int i = 0; i < q; i++) {
      int x = in.nextInt();
      int y = in.nextInt();

      if (x > list.size()) {
        System.out.println("ERROR!");
      } else {
        ArrayList<Integer> thisList = list.get(x - 1);
        if (y > thisList.size()) {
          System.out.println("ERROR!");
        } else {
          System.out.println(thisList.get(y - 1));
        }
      }
    }
  }

}
