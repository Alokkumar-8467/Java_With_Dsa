class Basic_Function {

  // return type has a datatype ==>> return value;
  public static int sum(int x, int y) {

    int sum = x + y;
    return sum;
  }

  // return type has void so it only print the value;
  public static void sum1(int x, int y){
    System.out.println(x + y);
  }

  public static void main(String[] args) {
    int a = 10;
    int b = 10;

    int result = sum(a, b);
    System.out.println(result);

    sum1(a,b);

  }
}
