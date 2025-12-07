import java.util.Scanner;

class Finding_SubArray {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter the Sie of an Array.");
    int n = in.nextInt();

    System.out.println("Enter the elements of an Array.");
    int arr[] = new int[n];

    for(int i = 0; i < n; i++)
    {
      arr[i] = in.nextInt();
    }

    for(int i = 0; i < n; i++)
    {
      for(int j = i; j < n; j++)
      {
        for(int k = i; k <= j; k++)
        {
          System.out.print(arr[k] + " ");
        }
        System.out.println();
      }
    }

  }
}
