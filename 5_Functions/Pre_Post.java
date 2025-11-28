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

    // One question

    int x = 5;
    int y = 7;

    int z = x++ + ++y + x + ++x;

    /*
     * in this program x++ so first x used then increase
     * So, x = 5 then increase to 6.
     * Now, ++y, so first value increase so y = 7 it increses first
     * so it become y = 8
     * 
     * Now, again x, so it is use latest value because early x++ post increment so x
     * become after increase is x = 6.
     * So Here x = 6
     * 
     * Now, x = 6, again ++x again so x become x = 7
     * So we get 5 + 8 + 6 + 7 = 26
     */

    System.out.println("value of Z is " + z);

  }
}
