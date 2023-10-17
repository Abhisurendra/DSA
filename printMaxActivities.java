// Java program for activity selection problem.

import java.lang.*;
import java.util.Scanner;

class ActivitySelection {

    public static void printMaxActivities(int s[], int f[],
                                          int n)
    {
        int i, j;

        System.out.println(
                "Following activities are selected");
        
        i = 0;
        System.out.print(i + " ");

        for (j = 1; j < n; j++) {

            if (s[j] >= f[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }


    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Array 1 size : ");
        int N = sc.nextInt();
        System.out.println("Enter the Array 2 size : ");
        int M = sc.nextInt();
        int s[] = new int[N];
        int f[]= new int[M];
        System.out.println("Enter both arrays : ");
        for(int i =0 ; i<s.length;i++){
            s[i]=sc.nextInt();
        }
        for(int i =0 ;i<f.length;i++){
            f[i]= sc.nextInt();
        }
        int n = s.length;

        printMaxActivities(s, f, n);
    }
}
