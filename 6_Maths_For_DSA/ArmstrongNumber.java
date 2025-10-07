import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number to find Armstrong.");
    int num = in.nextInt();

    armstrongFun(num);

  }

  public static void armstrongFun(int num) {
    int copyOfNum = num;

    int numOfDigits = 0;

    while (num > 0) {
      numOfDigits++;
      num = num / 10;
    }

    int sum = 0;

    int n = copyOfNum;

    while (n > 0) {
      int lastDigit = n % 10;
      sum = sum + powerFun(lastDigit, numOfDigits);
      n = n / 10;
    }

    if (sum == copyOfNum) {
      System.out.println(copyOfNum + " is an Armstrong Number ");
    } else {
      System.out.println(copyOfNum + " is not an Armstrong Number ");
    }

  }

  public static int powerFun(int a , int b) {
    int answer = 1;
    for(int i=1; i<=b; i++){
      answer = answer * a;
    }
    return answer;
  }

}
