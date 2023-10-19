// Java program to find Majority
// element in an array

import java.io.*;
import java.util.Scanner;

class MajorityElement {
    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount > n / 2)
            System.out.println(arr[index]);

        else
            System.out.println("No Majority Element");
    }

    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array : ");
        for(int i =0 ; i< arr.length ; i++){
            arr[i]= sc.nextInt();
        }
        int N = arr.length;

        findMajority(arr, N);
    }

}
