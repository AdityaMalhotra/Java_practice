import java.util.HashMap;

public class ArrayEqualizer
{
    public static void main(String[] args) {
        int[] arr = {3,3,2,1,3};
        System.out.println(equalizeArray(arr));
    }
    /*
       O(n) Solution to https://www.hackerrank.com/challenges/equality-in-a-array/problem
     */
    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        int initLength = arr.length;
        HashMap<Integer,Integer> freqChart = new HashMap<Integer,Integer>();
        for(int i = 0;i<arr.length;i++)
        {
            if(freqChart.containsKey(arr[i]))
            {
                freqChart.replace(arr[i],freqChart.get(arr[i]) + 1);
            }
            else
            {
                freqChart.put(arr[i],1);
            }
        }
        int maxFreq = 0;
        for(Integer i : freqChart.values())
        {
            if(maxFreq<i)
            {
                maxFreq  = i;
            }
        }
        return initLength - maxFreq;
    }
}
