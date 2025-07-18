import java.util.Scanner;

public class AreaPerimeter {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter Length of Rectangle");
    int l = obj.nextInt();
    System.out.println("Enter Breadth of Rectangle");
    int b = obj.nextInt();

    int area = l*b;
    int perimeter = 2 * (l+b);

    System.out.println("Area is = " + area);
    System.out.println("Perimeter is = " + perimeter);

  }
}
