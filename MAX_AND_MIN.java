import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;
import java.util.*;

class Pair {
    public int min;
    public int max;
}

class Main {
    static Pair getMinMax(int arr[], int n) {
        Pair minmax = new Pair();
        Arrays.sort(arr);
        minmax.min = arr[0];
        minmax.max = arr[n - 1];
        return minmax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n =sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array : ");
        for(int i =0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        Pair minmax = getMinMax(arr, n);
        System.out.println("Minimum element is " + minmax.min);
        System.out.println("Maximum element is " + minmax.max);
    }
}
