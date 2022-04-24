import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays
{
    public static void main(String[] args) {
        int[] A = {1,2,2,1};
        int[] B = {3,3,3,4};
        int k = 5;
        System.out.println(twoArrays(k,A,B));
    }
    // Complete the twoArrays function below.
    static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        List<Integer> integerList = new ArrayList<Integer>();
        for(int i=0;i<B.length;i++)
        {
            integerList.add(B[i]);
        }
        Collections.sort(integerList, Collections.reverseOrder());
        for(int i=0;i<A.length;i++)
        {
            if(A[i] + integerList.get(i)<k)
            {
                return "NO";
            }
        }
        return "YES";
    }
}
