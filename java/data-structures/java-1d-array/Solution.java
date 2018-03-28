import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scan.nextInt();
    }

    scan.close();

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

}
