import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers
{
    public static void main(String[] args) {
        int arr[] = {5,4,3,2};
        System.out.println(Arrays.toString(closestNumbers(arr)));
    }
    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        List<Integer> resultList = new ArrayList<Integer>();
        int min_Distance = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i]-arr[i+1]) <min_Distance)
            {
                min_Distance = Math.abs(arr[i]-arr[i+1]);
            }
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i] - arr[i+1]) == min_Distance)
            {
                resultList.add(arr[i]);
                resultList.add(arr[i+1]);
            }
        }
        int[] result = new int[resultList.size()];
        Integer[] temp = resultList.toArray(new Integer[resultList.size()]);
        for(int i=0;i<temp.length;i++)
        {
            result[i] = temp[i];
        }
        return result;
    }
}
