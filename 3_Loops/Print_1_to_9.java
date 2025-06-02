import java.util.*;
public class Print_1_to_9 {
  public static void main(String[] args) {

    System.out.println("Enter a number");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // Loop from 1 to 9
    for (int i = 0; i <= n; i++) {
      // Print the current number
      System.out.println(i);
    }
    
    // Print a message indicating the end of the program
    System.out.println("End of program");
  }
}