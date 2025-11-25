import java.util.Scanner;

public class nCr {


  public static long factorial(int n)
  {
    int factorial = 1;
    for(int i = 1; i<=n; i++)
    {
      factorial = factorial * i;
    }
    return factorial;
  }

  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter n abd r to find nCr");
    int n = in.nextInt();
    int r = in.nextInt();

    long n_factorial =  factorial(n);
    long r_factorial = factorial(r);
    long n_r_factorial = factorial(n - r);

    // we can us this but it give a very large number
    // long answer = n_factorial / (r_factorial * n_r_factorial);

    // so we can do this
    long answer = n_factorial / n_r_factorial;
    answer = answer / r_factorial;

    
    System.out.println("Factorial of " + n + " and " +  r +  " is " + answer);


  }
}
