import java.util.Scanner;

public class L_9_PalindromeNumber {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter number to check palindrome");
    int x = in.nextInt();

    if (x < 0) {
      System.out.println(x + " Number is Not a Palindrome");
    }

    int n = x;
    int revNum = 0;

    while (n > 0) {
      int lastNum = n % 10;
      revNum = revNum * 10 + lastNum;
      n = n / 10;
    }

    if (revNum == x) {
      System.out.println(revNum + " Number is Palindrome");
    } else {
      System.out.println(revNum + " Number is Not a Palindrome");
    }

  }
}