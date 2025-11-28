public class StackIn_Function {



  public static void f1()
  {
    System.out.println("This is F1.");
  }

    public static void f2()
  {
    System.out.println("This is F2.");
    f3();
  }

    public static void f3()
  {
    System.out.println("This is F3.");
  }

    public static void f4()
  {
    System.out.println("This is F4.");
  }

  public static void main(String[] args) {
    f1();    
    f2();    
    f3();    
    f4();    
  }
}
