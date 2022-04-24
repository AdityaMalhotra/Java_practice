import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSortPart1
{
    public static void main(String[] args) {
        int[] arr = {4,5,3,7,2};
        System.out.println(Arrays.toString(quickSort(arr)));
    }
    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        List left = new ArrayList<Integer>();
        List right = new ArrayList<Integer>();
        List equal = new ArrayList<Integer>();
        int i = 0;

        while(i<arr.length)
        {
            if(arr[i]<arr[0])
            {
               left.add(arr[i]);
            }
            else if(arr[i] == arr[0])
            {
                equal.add(arr[i]);
            }
            else
            {
                right.add(arr[i]);
            }
            i++;
        }
        List<Integer> result = new ArrayList<Integer>();
        result.addAll(left);
        result.addAll(equal);
        result.addAll(right);
        for(i = 0; i<arr.length;i++)
        {
            arr[i] = result.get(i);
        }
        return arr;
    }
}
