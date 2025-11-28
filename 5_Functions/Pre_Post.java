public class Pre_Post {
  public static void main(String[] args) {

    // Increment
    // PreFix Increment
    int a = 5;
    int c = ++a; // Pre-increment
    System.out.println("value of a is " + a);
    System.out.println("value of c is " + c);

    // PostFix Increment
    int b = 5;
    int d = b++; // Post-increment

    System.out.println("value of b is " + b);
    System.out.println("value of d is " + d);

    // Decrement

    int e = 5;
    int f = --e; // Pre-decrement
    System.out.println("value of e is " + e);
    System.out.println("value of f is " + f);

    // PostFix Increment
    int g = 5;
    int h = g--; // Post-decrement

    System.out.println("value of g is " + g);
    System.out.println("value of h is " + h);

  }
}
