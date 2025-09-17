import java.util.Scanner;

public class Print_Prime {

  public static void isPrime(int start, int end) {
    for (int i = start; i <= end; i++) {
      if (printPrime(i) == true) {
        System.out.println(i + "");
      }
    }
  }

  public static boolean printPrime(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the Lower Limit ");

    int start = in.nextInt();
    System.out.println("Enter the Upper Limit ");
    int end = in.nextInt();

    isPrime(start, end);

  }
}
