import java.util.Scanner;

public class DecimalToAnyBase {
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number you want to convert");
    int num = in.nextInt();

    System.out.println("Enter the base value");
    int base = in.nextInt();

    decimalToAnyBase(num, base);
  }

  public static void decimalToAnyBase(int decimalNum, int base){
    int resNum = 0;
    int power = 0;
    while(decimalNum > 0){
      int rem = decimalNum%base;
      decimalNum = decimalNum/base;
      resNum += rem * Math.pow(10, power);
      power++;
    }
    System.out.println("Result is " + resNum );
  }

}