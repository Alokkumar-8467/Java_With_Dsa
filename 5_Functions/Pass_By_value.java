public class Pass_By_value {

  public static void increment(int a)
  {
    a = a + 1;
    System.out.println("Value of a inside increment function: " + a);
  }

  public static void main(String[] args) {
    int a = 7;
    increment(a);
    System.out.println("Value of a " + a);
  }  
}

/* 
This is pass by value concept in java. Here when we call increment(a) function from main function, the value of a (which is 7) is copied to the parameter a of increment function. So when we increment a inside increment function, it does not affect the value of a in main function.

When we run this code, the output will be:
Value of a inside increment function: 8
Value of a 7

*/