// A Java program to find a common
// element in all rows of a
// row wise sorted array

class FindCommon {

    static final int M = 4;
    static final int N = 5;
    static int findCommon(int mat[][])
    {

        int column[] = new int[M];

        int min_row;
        int i;
        for (i = 0; i < M; i++)
            column[i] = N - 1;


        min_row = 0;

        while (column[min_row] >= 0) {

            for (i = 0; i < M; i++) {
                if (mat[i][column[i]] < mat[min_row][column[min_row]])
                    min_row = i;
            }

            int eq_count = 0;
            for (i = 0; i < M; i++) {

                if (mat[i][column[i]] > mat[min_row][column[min_row]]) {
                    if (column[i] == 0)
                        return -1;
                    column[i] -= 1;
                }
                else
                    eq_count++;
            }


            if (eq_count == M)
                return mat[min_row][column[min_row]];
        }
        return -1;
    }


    public static void main(String[] args)
    {
        int mat[][] = { { 1, 2, 3, 4, 5 },
                { 2, 4, 5, 8, 10 },
                { 3, 5, 7, 9, 11 },
                { 1, 3, 5, 7, 9 } };
        int result = findCommon(mat);
        if (result == -1)
            System.out.print("No common element");
        else
            System.out.print("Common element is " + result);
    }
}


