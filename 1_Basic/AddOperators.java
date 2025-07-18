import java.util.Scanner;

public class AddOperators {
  public static void main (String args[])
  {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter two number for Arithmatic Operation");
    int a = obj.nextInt();
    int b = obj.nextInt();

    int c = a + b;
    int d = a - b;
    int e = a * b;
    int f = a / b;
    int g = a % b;

    System.out.println("Sum of a + b = " + c);
    System.out.println("Diff of a - b = " + d);
    System.out.println("Multi of a * b = " + e);
    System.out.println("Division of a / b = " + f);
    System.out.println("Module of a % b = " + g);

  }
}
