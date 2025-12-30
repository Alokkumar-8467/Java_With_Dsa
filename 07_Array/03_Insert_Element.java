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


// i = point new array and j = point old array

/* 

Iteration 1:

i = 0, j = 0
while(i < 5)  // true
if(i == position-1)  // position-1 = 2, i=0 → false
else:
    answer[0] = arr[0];  // answer[0] = 10
    j++;  // j = 1
i++;  // i = 1


Iteration 2:

i = 1, j = 1
while(i < 5)  // true
if(i == 2)  // false (1 ≠ 2)
else:
    answer[1] = arr[1];  // answer[1] = 20
    j++;  // j = 2
i++;  // i = 2


Iteration 3:

i = 2, j = 2
while(i < 5)  // true
if(i == 2)  // TRUE (i equals position-1)
    answer[2] = value;  // answer[2] = 25
    // NO j++ here! j stays at 2
i++;  // i = 3


Iteration 4:

i = 3, j = 2  // j is still 2 from last iteration
while(i < 5)  // true
if(i == 2)  // false (3 ≠ 2)
else:
    answer[3] = arr[2];  // answer[3] = arr[2] = 30
    j++;  // j = 3
i++;  // i = 4


Iteration 5:

i = 4, j = 3
while(i < 5)  // true
if(i == 2)  // false (4 ≠ 2)
else:
    answer[4] = arr[3];  // answer[4] = arr[3] = 40
    j++;  // j = 4
i++;  // i = 5



Step-by-step execution:

i	j	Condition	answer array
0	0	i≠2 → copy	[10, _, _, _, _]
1	1	i≠2 → copy	[10, 20, _, _, _]
2	2	i=2 → insert 25	[10, 20, 25, _, _]
3	2	i≠2 → copy	[10, 20, 25, 30, _]
4	3	i≠2 → copy	[10, 20, 25, 30, 40]

*/

