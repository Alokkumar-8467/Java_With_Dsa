import java.util.Scanner;

public class DecimalToBinary{
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the Number you want to convert into binary");
    int num = in.nextInt();

    decimaltoBinary(num);
  }

  public static void decimaltoBinary(int decimalNum){
    int resNum = 0;
    int power = 0;
    while (decimalNum > 0){
      int rem = decimalNum%2;
      decimalNum /= 2;
      resNum += rem * Math.pow(10, power);
      power++;
    }
    System.out.println("Result is " + resNum);
  }

}