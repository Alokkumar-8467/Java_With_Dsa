import java.util.Scanner;

public class nPr {

  public static long factorial(int n)
  {
    int factorial  = 1;
    for (int i =1; i<= n; i++)
    {
      factorial = factorial * i;
    }

    return factorial;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter n and r to find nPr");

    int n = in.nextInt();
    int r = in.nextInt();

    long n_factorial = factorial(n);
    long n_r_factorial = factorial(n - r);

    long answer = n_factorial / n_r_factorial;

    System.out.println("nPr Factorial of " + n + " and " + r + " is " + answer);
    
  }
}
