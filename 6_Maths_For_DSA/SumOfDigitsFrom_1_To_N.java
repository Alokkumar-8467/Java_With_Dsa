import java.util.Scanner;

public class SumOfDigitsFrom_1_To_N {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your starting number");
    int num = in.nextInt();

    sumOfDigit(num);

  }

  public static void sumOfDigit (int num) {
    
    for(int i=1; i<=num; i++){
      int copyOfI = i;

      int sum = 0;

      while(copyOfI > 0){
        int lastDigit = copyOfI%10;
        sum = sum + lastDigit;
        copyOfI = copyOfI/10;
      }
      System.out.println("Sum of " + i + " = " + sum);
    }
  }
}
