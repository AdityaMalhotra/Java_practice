import java.util.Arrays;

public class MarkAndToys
{
    public static void main(String[] args) {

    }
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int count = 0;
        Arrays.sort(prices);
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<=k)
            {
                count++;
                k-=prices[i];
            }
        }
        return count;
    }
}
