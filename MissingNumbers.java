import java.util.*;

public class MissingNumbers
{
    public static void main(String[] args)
    {
        int[] arr = {203,204,205,206,207,208,203,204,205,206};
        int[] brr = {203,204,204,205,206,207,205,208,203,206,205,206,204};

        System.out.println(Arrays.toString(missingNumbers(arr,brr)));
    }
    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        Set<Integer> resultSet = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i]) + 1);
            }
            else
            {
                hashMap.put(arr[i],1);
            }
        }

        for(int j=0;j<brr.length;j++)
        {
            if(hashMap.containsKey(brr[j]) && hashMap.get(brr[j])>0)
            {
                hashMap.put(brr[j],hashMap.get(brr[j]) - 1);
            }
            else
            {
                resultSet.add(brr[j]);
            }
        }
        int[] resultArray = new int[resultSet.size()];
        int x = 0;
        for(Integer i : resultSet)
        {
            resultArray[x++] = i;
        }
        Arrays.sort(resultArray);
        return resultArray;
    }
}
