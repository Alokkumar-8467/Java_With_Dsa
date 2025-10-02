import java.util.Scanner;

public class CountDigit {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number you want to count the Digit.");

    long digit = in.nextLong();

    countDigit(digit);

  }

  public static int countDigit(long digit) {
    long num = digit;

    int count = 0;

    while (num > 0) {
      num = num / 10;
      count++;
    }

    System.out.println("This given number " + digit + " has " + count + " digits. ");
    return count;
  }

}
