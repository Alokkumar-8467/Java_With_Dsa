/*

1       1
 2     2
  3   3
   4 4
    5
   4 4
  3   3
 2     2
1       1


*/


import java.util.Scanner;

public class Pattern_19 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter number of rows");

    int n = scn.nextInt();

    // Upper part

    int leftSapce = 0;
    int middelSpace = 1 + (n-2)*2;

    for(int i =1; i<=n; i++){
      // leftSpace printing
      for(int j=1; j<=leftSapce; j++){
        System.out.print(" ");
      }

      System.out.print(i);

      // middleSpace
      for(int j=1; j<=middelSpace; j++){
        System.out.print(" ");
      }

      if(i != n){
        System.out.print(i);
      }

      leftSapce = leftSapce + 1;
      middelSpace = middelSpace - 2;

      System.out.println();

    }

    // lower part

    leftSapce = n -2;
    middelSpace = 1;

    for(int i =n-1; i>=1; i--){
      // leftSpace printing
      for(int j=1; j<=leftSapce; j++){
        System.out.print(" ");
      }

      System.out.print(i);

      // middleSpace
      for(int j=1; j<=middelSpace; j++){
        System.out.print(" ");
      }

      System.out.print(i);

      leftSapce = leftSapce - 1;
      middelSpace = middelSpace + 2;

      System.out.println();

    }

  }
}
