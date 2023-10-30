
import java.util.*;

class FindMaxSum
{
    static int rec(int nums[], int idx,int N)
    {
        if (idx >= N)
            return 0;
        return Math.max(nums[idx] + rec(nums, idx + 2, N),
                rec(nums, idx + 1, N));
    }

    static int findMaxSum(int[] arr, int N)
    {
        return rec(arr, 0, N);
    }


    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter the Array: ");
        for(int i =0;i< arr.length;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println(findMaxSum(arr, N));
    }
}

