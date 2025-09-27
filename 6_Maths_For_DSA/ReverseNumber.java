import java.util.Scanner;

public class ReverseNumber {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter a Number");
    int num = in.nextInt();

    reverseNumber(num);
    
  }

  public static void reverseNumber(int num) {
    int revNum = 0;

    while(num > 0){
      int lastDigit = num%10;
      revNum =  (revNum * 10 ) + ( lastDigit );
      num = num/10;
    }

    
    System.out.println("Reverse of that number is " + revNum);

  }

}

