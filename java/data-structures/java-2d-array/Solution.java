import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[][] = new int[6][6];
    for (int j = 0; j < 6; j++) {
      for (int i = 0; i < 6; i++) {
        arr[i][j] = in.nextInt();
      }
    }

    int max = Integer.MIN_VALUE;
    for (int j = 0; j < 4; j++) {
      for (int i = 0; i < 4; i++) {
        int ans = arr[i][j] + arr[i + 1][j] + arr[i + 2][j]
                  + arr[i + 1][j + 1]
                  + arr[i][j + 2] + arr[i + 1][j + 2] + arr[i + 2][j + 2];
        max = ans > max ? ans : max;
      }
    }

    System.out.println(max);
  }

}
