import java.util.*;
public class Print_1_to_9 {
  public static void main(String[] args) {

    System.out.println("Enter a number");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String name = scn.nextLine();
    System.out.println("Hello " + name + ", you entered: " + n);
    for (int i = 0; i <= n; i++) {
      // Print the current number
      System.out.println(i);
    }
    
    // Print a message indicating the end of the program
    System.out.println("End of program");
  }
}

// I any system if we want to take integer input then we use nextInt() method
// If we want to take string input then we use nextLine() method  
// If we want to take both integer and string input then we use int n = Integer.parseInt(scn.nextInt()) for Integer and then nextLine() to consume the newline character
