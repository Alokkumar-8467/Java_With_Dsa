/*

1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

*/

import java.util.Scanner;

public class Pattern_14 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of rows");
    int row = scn.nextInt();

    for(int i = row; i >= 1; i--){
      for(int j = 1; j <= i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }

  }
}
