class ArrayFunction {

  // here pass by value (so original value is not changes)
  public static void updated(int a){
    a = a + 1;
    System.out.println("Updated value of a = " + a);
  }

  // in Array it use pass by reference (so original value is changed.)
  public static void updatedArray(int arr[]) {
    arr[0] = 10;
    arr[1] = 20;
    System.out.println("Printing Array after updated");
    for(int i = 0; i<5; i++)
    {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int a = 5;
    System.out.println("Value of a = " + a);
    updated(a);

    int arr[] = new int[5];
    arr[0] = 1;
    arr[1] = 2;

    System.out.println("Printing Array before updated");
    for(int i = 0; i<5; i++)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    updatedArray(arr);
    System.out.println();
    System.out.println("Main Array Original Array");
    for(int i = 0; i<5; i++)
    {
      System.out.print(arr[i] + " ");
    }

  }
}
