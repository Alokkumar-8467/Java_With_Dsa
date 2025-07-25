
// Print first n Fibonacci Number

// input n
// example
//  0
//  1
//  1
//  2
//  3
//  5



import java.util.Scanner;

public class Print_All_Fibonacci_Numbers_till_N {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter the n upto which you want to find Fibonacci");
    int n = scn.nextInt();

    int firstTerm = 0;
    int secondTerm = 1;

    for (int i = 1; i <= n; i++) {
      System.out.println(firstTerm);
      int thirdTerm = firstTerm + secondTerm;

      firstTerm = secondTerm;
      secondTerm = thirdTerm;
    }

    System.out.println("This output for final n fibonacci Number " + firstTerm);

  }
}