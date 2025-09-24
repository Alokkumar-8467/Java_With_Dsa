import java.util.Scanner;

public class PowerOfNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the Number to find power");
    int num = in.nextInt();

    System.out.println("Enter the power value");
    int power = in.nextInt();

    powerFun(num,power);
  }

  public static double powerFun(int num, int power) {
    double res = 1;
    for(int i = 0; i< power; i++){
      res = res* num;
    }
    System.out.println(res);
    return res;
  }

}
