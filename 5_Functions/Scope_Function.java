public class Scope_Function {

  int t = 50; // t is global to all functions of this class

  public static void print(int z)
  {
    System.out.println("Value of z is: " + z);
  }

  public static void main(String[] args) {
    int a = 10; // a is local to main function
    int b= 20;
    if(a > b)
    {
      int c = 12; // c is local to this if block only or local varaible.
      System.out.println("C variable is scoped it only used under this if block not outside. " + c);
    }

    // System.out.println("z value is: " + z);
    // we cant access z here because its scoped to print function only

  }
}
