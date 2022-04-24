import java.util.HashMap;

public class MinimumDistances
{
    public static void main(String[] args) {
        int[] a = {7,1,3,4,1,7};
        System.out.println(minimumDistances(a));
    }

    // Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
        HashMap<Integer,Integer> index = new HashMap<Integer,Integer>();
        boolean flag = false;
        int minDistance = Integer.MAX_VALUE;
        for(int i = 0;i<a.length;i++)
        {
            if(index.containsKey(a[i]))
            {
                int distance = i-index.get((a[i]));
                System.out.println("Distance = " + distance);
                index.replace(a[i],distance);
                if(minDistance>distance)
                {
                    minDistance = distance;
                }
                flag = true;
            }
            else
            {
                index.put(a[i],i);
            }
        }
        if(!flag)
        {
            return -1;
        }
        return minDistance;
    }
}
