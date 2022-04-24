import java.util.Arrays;

public class BeautifulPairs
{
    public static void main(String[] args) {
        int[] A = {3,5,7,11,5,8};
        int[] B = {5,7,11,10,5,8};
        System.out.println(beautifulPairs(A,B));
    }
    // Complete the beautifulPairs function below.
    static int beautifulPairs(int[] A, int[] B) {
        int count = 0;
        int[] ACount = new int[1001];
        int[] BCount = new int[1001];
        Arrays.fill(ACount,0);
        for(int i=0;i<A.length;i++)
        {
            ACount[A[i]]++;
        }
        for(int i=0;i<B.length;i++)
        {
            if(ACount[B[i]]>0)
            {
                ACount[B[i]]--;
                count++;
            }
        }
        if(count == A.length)
            count--;
        else
            count++;

    return count;
    }
}
