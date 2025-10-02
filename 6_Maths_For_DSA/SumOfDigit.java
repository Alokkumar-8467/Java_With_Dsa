import java.util.Scanner;

public class SumOfDigit {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter number to find the Sum");


    int num = in.nextInt();

    digitSum(num);

  }
  

  public static int digitSum(int num) {

    int digit = num;
    int sum = 0;

    while (digit > 0) {
      int lastDigit = digit % 10;
      sum = sum + lastDigit;
      digit = digit / 10; 
    }

    System.out.println("Sum of " + num + " is " + sum);
    return sum;

  }

}
