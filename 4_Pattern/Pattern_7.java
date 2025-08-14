/*

_ _ _ _ * * * * *    for i = 1 space = 4 and star = row
_ _ _ * * * * *      for i = 2 space = 3 and star = row
_ _ * * * * *        for i = 3 space = 2 and star = row
_ * * * * *          for i = 4 space = 1 and star = row
* * * * *            for i = 5 space = 0 and star = row

*/

import java.util.Scanner;

public class Pattern_7 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of rows");

    int row = scn.nextInt();

    int space = row - 1;
    int star = row;

    for (int i = 1; i <= row; i++) {

      // for printing space
      for (int j = 1; j <= space; j++) {
        System.out.print("  ");
      }

      // for printing star
      for (int j = 1; j <= star; j++) {
        System.out.print("* ");
      }

      space = space - 1;

      System.out.println();

    }

  }
}
