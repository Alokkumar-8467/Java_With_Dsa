import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the binary you want to convert to decimal");
    int binaryNum = in.nextInt();

    binaryToDecimal(binaryNum);  

  }

  public static void binaryToDecimal(int binaryNum) {
    int resNum = 0;
    int power = 0;

    while (binaryNum > 0) {
      int unitDigit = binaryNum % 10;
      resNum += unitDigit * Math.pow(2, power);
      binaryNum = binaryNum/10;
      power++; 
    }
    System.out.println("Result is " + resNum);
  }

}
