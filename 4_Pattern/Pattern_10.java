
/*

5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 

*/

import java.util.Scanner;

public class Pattern_10 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of rows");
    int row = scn.nextInt();

    for(int i = row; i >= 1; i--){
      for(int j = 1; j <= i; j++){
        System.out.print(i + " ");
      }
      System.out.println();
    }

  }
}
