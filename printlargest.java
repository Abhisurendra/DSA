// Given an array of numbers, program to
// arrange the numbers to form the
// largest number
import java.util.*;

class printlargest {


    static void printLargest(Vector<String> arr)
    {

        Collections.sort(arr, new Comparator<String>()
        {

            @Override public int compare(String X, String Y)
            {

                String XY = X + Y;

                String YX = Y + X;

                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        Iterator it = arr.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

    public static void main(String[] args)
    {

        Vector<String> arr = new Vector<String>();
        
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");

        printLargest(arr);
    }
}


