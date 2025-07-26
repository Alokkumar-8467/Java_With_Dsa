import java.util.Scanner;

public class Print_All_Tribonacci_Numbers_till_N {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter the n upto which you want to find Tribonacci");
    int n = scn.nextInt();

    int firstTerm = 0;
    int secondTerm = 1;
    int thirdTerm = 1;

    for (int i = 1; i <= n; i++) {
      System.out.println(firstTerm);
      int fourthTerm = firstTerm + secondTerm + thirdTerm;

      firstTerm = secondTerm;
      secondTerm = thirdTerm;
      thirdTerm  = fourthTerm;
    }

    System.out.println("This output for final " + n +  " nth Tribonacci Number " + firstTerm);

  }
}
