
/*

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

*/

import java.util.Scanner;

public class Pattern_9 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of rows");
    int row = scn.nextInt();

    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= i; j++){
        System.out.print(i + " ");
      }
      System.out.println();
    }

  }
}
