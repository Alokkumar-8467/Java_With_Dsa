import java.util.Scanner;

public class SimpleInterest {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter P");
    int p = obj.nextInt();
    System.out.println("Enter R");
    int r = obj.nextInt();
    System.out.println("Enter T");
    int t = obj.nextInt();

    int SI = (p*r*t)/100;

    System.out.println("SI of given value is = " + SI);

  }
}
