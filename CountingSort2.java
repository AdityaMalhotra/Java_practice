import java.util.Arrays;

public class CountingSort2
{
    public static void main(String[] args) {
        int[] arr= {19,10,12,10,24,25,22};
        System.out.println(Arrays.toString(countingSort(arr)));
    }
    // Complete the countingSort function below.
    static int[] countingSort(int[] arr) {
        int countArray[] = new int[100];

        Arrays.fill(countArray,0);
        for(int i=0;i<arr.length;i++)
        {
            countArray[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<countArray.length;i++)
        {
            while(countArray[i]>0)
            {
                arr[j]=i;
                j++;
                countArray[i]--;
            }
        }
        return arr;
    }
}
