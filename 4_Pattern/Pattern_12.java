/*

5 
4 4
3 3 3
2 2 2 2
1 1 1 1 1

*/

import java.util.Scanner;

public class Pattern_12 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of rows");
    int row = scn.nextInt();

    for(int i = row; i >= 1; i--){
      for(int j = i; j <= row; j++){
        System.out.print(i + " ");
      }
      System.out.println();
    }

  }
}
