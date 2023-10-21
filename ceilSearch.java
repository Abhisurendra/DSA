import java.util.Scanner;

class ceilSearch
{
    /* Function to get index of ceiling
    of x in arr[low..high] */
    static int ceilsearch(int arr[], int low, int high, int x)
    {
        int i;

        if(x <= arr[low])
            return low;

        for(i = low; i < high; i++)
        {
            if(arr[i] == x)
                return i;

            if(arr[i] < x && arr[i+1] >= x)
                return i+1;
        }

        return -1;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int N = sc.nextInt();
        System.out.println("Enter the array : ");
        int arr[] = new int[N];
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        //int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int n = arr.length;
        System.out.println("Enter the number to be searched");
        int x = sc.nextInt();
        //int x = 3;
        int index = ceilsearch(arr, 0, n-1, x);
        if(index == -1)
            System.out.println("Ceiling of "+x+" doesn't exist in array");
        else
            System.out.println("ceiling of "+x+" is "+arr[index]);
    }
}
