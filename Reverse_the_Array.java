import java.util.Scanner;

public class Reverse_the_Array {
    static void rvereseArray(int arr[],
                             int start, int end)
    {
        int temp;

        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    static void printArray(int arr[], int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array : ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        printArray(arr, n);
        rvereseArray(arr, 0, n-1);
        System.out.print("Reversed array is \n");
        printArray(arr, n);

    }
}


