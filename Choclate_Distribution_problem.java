
import java.util.*;

class Choclate_Distribution_problem {


    static int findMinDiff(int arr[], int n, int m)
    {

        if (m == 0 || n == 0)
            return 0;

        Arrays.sort(arr);


        if (n < m)
            return -1;

        int min_diff = Integer.MAX_VALUE;


        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }


    public static void main(String[] args)
    {   Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array : ");
        for(int i = 0; i < arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the number of Student");
        int m = sc.nextInt();


        System.out.println("Minimum difference is "
                + findMinDiff(arr, n, m));
    }
}

