// Java program to find a pair with a given
// sum in a sorted and rotated array

import java.io.*;
import java.util.Scanner;

class PairInSortedRotated {

    static boolean pairInSortedRotated(int arr[], int n,
                                       int x)
    {

        int i;
        for (i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1])
                break;


        int l = (i + 1) % n;


        int r = i;

        while (l != r) {

            if (arr[l] + arr[r] == x)
                return true;


            if (arr[l] + arr[r] < x)
                l = (l + 1) % n;


            else
                r = (n + r - 1) % n;
        }
        return false;
    }


    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array : ");
        for(int i = 0 ; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the sum : ");
        int X= sc.nextInt();


        int N = arr.length;

        if (pairInSortedRotated(arr, N, X))
            System.out.print("true");
        else
            System.out.print("false");
    }
}

