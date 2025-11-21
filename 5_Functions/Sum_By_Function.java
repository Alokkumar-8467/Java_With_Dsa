import java.util.Scanner;

public class Sum_By_Function {

  public static int sumOfDigit(int n){
    int sum = 0;
    while(n > 0)
    {
      int lastDigit = n%10;
      sum = sum + lastDigit;
      n = n/10;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter number to find Sum");

    int num = in.nextInt();

    sumOfDigit(num);
    System.out.println(sumOfDigit(num));
  }
}
