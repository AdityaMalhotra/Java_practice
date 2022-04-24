import java.util.Arrays;

public class IceCreamParlor
{
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2};
        System.out.println(Arrays.toString(icecreamParlor(4,arr)));
    }
    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
        int[] result = new int[2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(m-arr[i]-arr[j] == 0)
                {
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return result;
    }
}
