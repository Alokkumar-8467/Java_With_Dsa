/*
Printing this pattern

* * * * * 
* * * * *
* * * * *
* * * * *
* * * * *

*/

import java.util.Scanner;

public class Pattern_3 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter no of rows");

    int row = scn.nextInt();

    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= row; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }
}
