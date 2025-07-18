import java.util.Scanner;

public class Temperature {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter Temperature");

    double tempinFeh = obj.nextDouble();

    double tempinCel = ((tempinFeh - 32) * 5.0)/9.0;

    System.out.println("Temperature after converting from Feh to Cel is = " +  tempinCel);

  }
}
