import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PythagoreanTriplets
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] inputLine = br.readLine().trim().split("\\s+");
            long[] arr = new long[n];
            HashMap<Long,Boolean> hashMap = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                arr[i] = (long)Math.pow(Integer.parseInt(inputLine[i]),2);
                hashMap.put(arr[i],true);
            }
            String str = checkTriplets(arr,n,hashMap);
            System.out.println(str);
        }
    }
    public static String checkTriplets(long[] arr, int n,HashMap<Long,Boolean> hashMap)
    {
        for(int i=0;i<n;i++)
        {
            for(int j = i;j<n;j++)
            {
                if(hashMap.containsKey(arr[i] + arr[j]))
                    return "Yes";
            }
        }
        return "No";
    }
}
