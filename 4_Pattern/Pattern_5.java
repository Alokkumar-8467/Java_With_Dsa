/*

    * 
   * *
  * * *
 * * * *
* * * * *

*/

import java.util.Scanner;

public class Pattern_5 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of rows");
    int row = scn.nextInt();

    int space = row - 1;
    int star = 1;

    for (int i = 1; i <= row; i++) {

      // For printing space
      for (int j = 1; j <= space; j++) {
        System.out.print(" ");
      }

      // for printing star
      for (int j = 1; j <= star; j++) {
        System.out.print("* ");
      }
      space = space - 1;
      star = star + 1;
      System.out.println();
    }

  }
}
