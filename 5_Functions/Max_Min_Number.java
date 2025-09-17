import java.util.Scanner;



public class Max_Min_Number {

  public static int maxNumber(int x, int y){
  if(x > y){
    return x;
  } else
  {
    return y;
  }
}

public static int minNumber(int x, int y){
  if(x < y){
    return x;
  } else
  {
    return y;
  }
}
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter two number");

    int a = in.nextInt();
    int b = in.nextInt();

    System.out.println("Max number is " + maxNumber(a,b));
    System.out.println("Min number is " + minNumber(a,b));

  }
}
