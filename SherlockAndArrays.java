import java.util.ArrayList;
import java.util.List;

public class SherlockAndArrays
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(balancedSums(list));
    }
    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {
        if(arr.size() == 1)
            return "YES";

        int sumLeft = 0;
        int sumRight = 0;
        for(int i=0;i<arr.size();i++)
        {
            sumRight+=arr.get(i);
        }
        for(int i=0;i<arr.size()-1;i++)
        {
            if(i>0)
            {
                sumLeft+=arr.get(i-1);
            }
            sumRight-=arr.get(i);
            if(sumLeft==sumRight)
                return "YES";
        }
        return "NO";
    }
}
