// Java proram to transform the string

import java.io.*;
import java.util.*;

class Transform {
    public static int transform(String A, String B)
    {
        if (A.length() != B.length()) {
            return -1;
        }

        HashMap<Character, Integer> m
                = new HashMap<Character, Integer>();
        int n = A.length();
        for (int i = 0; i < n; i++) {
            if (m.containsKey(A.charAt(i)))
                m.put(A.charAt(i), m.get(A.charAt(i)) + 1);
            else
                m.put(A.charAt(i), 1);
        }

        for (int i = 0; i < n; i++) {
            if (m.containsKey(B.charAt(i)))
                m.put(B.charAt(i), m.get(B.charAt(i)) - 1);
        }
        for (Map.Entry<Character, Integer> entry :
                m.entrySet()) {
            if (entry.getValue() != 0)
                return -1;
        }

        int i = n - 1, j = n - 1;
        int res = 0;
        while (i >= 0 && j >= 0) {
            while (i >= 0 && A.charAt(i) != B.charAt(j)) {
                res++;
                i--;
            }
            i--;
            j--;
        }
        return res;
    }
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        String A = sc.nextLine();
        System.out.println("Enter the second string : ");
        String B = sc.nextLine();

        System.out.println(
                "Minimum number of operations required is "
                        + transform(A, B));
    }
}

