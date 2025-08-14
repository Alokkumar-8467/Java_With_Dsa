
/*

5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 


*/

import java.util.Scanner;

public class Pattern_15 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of rows");
    int row = scn.nextInt();

    for(int i = row; i >= 1; i--){
      for(int j = row; j >= i; j--){
        System.out.print(j + " ");
      }
      System.out.println();
    }

  }
}
