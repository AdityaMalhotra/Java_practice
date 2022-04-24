import java.util.Arrays;

public class AbsoluteDifference
{
    public static void main(String[] args) {
        int arr[] = {-59,-36,-13,1,-53,-92,-2,-96,-54,75};
        System.out.println(minimumAbsoluteDifference(arr));
    }
    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int minDifference = Math.abs(arr[0] - arr[1]);
        for(int i=0;i<arr.length-1;i++)
        {
            if(Math.abs(arr[i] - arr[i+1])<minDifference)
            {
                minDifference = Math.abs(arr[i] - arr[i+1]);
            }
        }
        return minDifference;
    }
}
