import java.util.Scanner;

public class AverageOfMarks {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter all 5 Subjects marks");
    float a = obj.nextFloat(); 
    float b = obj.nextFloat(); 
    float c = obj.nextFloat(); 
    float d = obj.nextFloat(); 
    float e = obj.nextFloat(); 

    double sum = (a+b+c+d+e);

    double average = sum/5;

    double percentage = (sum*100)/500;

    System.out.println("Total Sum of marks is = " + sum + "Out of 100");
    System.out.println("Average of marks is = " + average);
    System.out.println("Percentage of marks is = " + percentage);

  }
}
