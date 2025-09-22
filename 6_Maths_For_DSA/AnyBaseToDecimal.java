import java.util.Scanner;

public class AnyBaseToDecimal {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter any base you want to convert to decimal");
    int binaryNum = in.nextInt();

    System.out.println("Enter the base value you want to convert to decimal");
    int base = in.nextInt();

    anyBaseToDecimal(binaryNum, base);  

  }

  public static void anyBaseToDecimal(int binaryNum, int base) {
    int resNum = 0;
    int power = 0;

    while (binaryNum > 0) {
      int unitDigit = binaryNum % 10;
      resNum += unitDigit * Math.pow(base, power);
      binaryNum = binaryNum/10;
      power++; 
    }
    System.out.println("Result is " + resNum);
  }
}
