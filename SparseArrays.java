import java.util.HashMap;

public class SparseArrays
{
    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        int[] result = new int[queries.length];

        for(String str :strings)
        {
            hashMap.put(str,hashMap.containsKey(str)?hashMap.get(str)+1:1);
        }
        for(int i=0;i<queries.length;i++)
        {
            result[i] = hashMap.containsKey(queries[i])?hashMap.get(queries[i]):0;
        }
        return result;

    }
}
