import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

public class JimAndTheOrders
{
    public static void main(String[] args) {
        int[][] orders = {{1,1},{1,1}};
        System.out.println(Arrays.toString(jimOrders(orders)));
    }
    // Complete the jimOrders function below.
    static int[] jimOrders(int[][] orders) {
        SortedMap map = new TreeMap<Long, Integer>();
        int[] result = new int[orders.length];
        for (int i = 0; i < orders.length; i++) {

            long sum = (long) (orders[i][0] + orders[i][1]);
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
            else
            {
                map.put(sum+1,i);
            }
        }
        int i = 0;
        for (Object j : map.values()) {
            result[i] = (int) j + 1;
            i++;
        }
        return result;
    }
//        int[] sumArray = new int[orders.length];
//
//        for(int i=0;i<orders.length;i++)
//        {
//            int sum = orders[i][0] + orders[i][1];
//            sumArray[i] = sum;
//        }
//        int[] result = new int[orders.length];
//        int i=0;
//        Arrays.fill(result,i++);
//
//        for(i = 0;i< sumArray.length-1;i++)
//        {
//            int j=i+1;
//            while(sumArray[j]<sumArray[j-1])
//            {
//                int temp = sumArray[j];
//                sumArray[j] = sumArray[j-1];
//                sumArray[j-1] = temp;
//                int temp2 = result[j];
//
//                j--;
//            }
//        }
}
