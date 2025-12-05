import java.util.Scanner;

class Insert_Element {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size of Array.");
    int n = in.nextInt();

    System.out.println("Enter the element of Array");

    int arr[] = new int[n];

    for(int i = 0; i<n; i++)
    {
      arr[i] = in.nextInt();
    }

    System.out.println("Enter the value you want to insert");

    int value = in.nextInt();

    System.out.println("Enter the position where you want to insert the Value.");

    int position = in.nextInt();

    int answer[] = new int[n+1];

    int i = 0;
    int j = 0;

    while(i < n + 1)
    {
      if(i == position - 1)
      {
        answer[i] = value;
      }
      else
      {
        answer[i] = arr[j];
        j++;
      }
      i++;
    }

    // now to print new array value;
    i = 0;
    while(i < n + 1)
    {
      System.out.println(answer[i] + " ");
      i++;
    }

  }
}
