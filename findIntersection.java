 
import java.io.*;

public class findIntersection {

    //
    static void FindIntersection(int[] arr1, int[] arr2,
                                 int[] temp, int m, int n,
                                 int[] k)
    {
        int i = 0, j = 0;

        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {
                i++;
            }

            else if (arr2[j] < arr1[i]) {
                j++;
            }

            else {
                temp[k[0]] = arr1[i];
                i++;
                j++;
                k[0]++;
            }
        }
    }

    public static void main(String[] args)
    {

        int[] arr1 = { 1, 5, 10, 20, 40, 80 };
        int[] arr2 = { 6, 7, 20, 80, 100 };
        int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;

        int[] temp = new int[200000];

        int[] ans = new int[200000];

        int[] k = {
                0
        };

        FindIntersection(arr1, arr2, temp, n1, n2, k);
        int tempSize = k[0];
        k[0] = 0;

        FindIntersection(arr3, temp, ans, n3, tempSize, k);

        System.out.println(
                "Common elements present in arrays are :");

        for (int i = 0; i < k[0]; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
