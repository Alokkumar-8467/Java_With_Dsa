import java.util.*;

public class Check_Prime_Or_Not {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number ");
    int t = scn.nextInt();
    for (int i = 0; i < t; i++){
      System.out.println(" Enter a number to check if it is prime or not");
      int n = scn.nextInt();
      int count = 0;
      for (int div = 1; div <= n; div++){
        if(n % div == 0){
          count++;
        }
      }
      if(count == 2){
          System.out.println(" Number is Prime " + n);
        }
        else{
          System.out.println(" Number is Not Prime " + n);
        }
      System.out.println(" Hello " + n);
    }
  }
}
