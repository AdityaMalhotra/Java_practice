import java.util.Arrays;

public class CountingSort1
{
    public static void main(String[] args) {

    }
    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
        int resultArray[] = new int[100];
        Arrays.fill(resultArray,0);
        for(int i=0;i<arr.length;i++)
        {
            resultArray[arr[i]]++;
        }
        return resultArray;
    }
}
