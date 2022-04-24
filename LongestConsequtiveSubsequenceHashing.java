import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class LongestConsequtiveSubsequenceHashing
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split("\\s+");
            int arr[] = new int[n];
            SortedMap<Integer,Integer> hm = new TreeMap<>();
            for(int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(str[i]);
                hm.put(arr[i],1);
            }
            int max = 0;
            for(Map.Entry<Integer,Integer> entry : hm.entrySet())
            {
                if(hm.containsKey(entry.getKey() - 1))
                {
                    hm.put(entry.getKey(),hm.get(entry.getKey() - 1) + 1);
                }
            }
            for(Map.Entry<Integer,Integer> entry : hm.entrySet())
            {
                if(entry.getValue() > max)
                    max = entry.getValue();
            }
                sb.append(max + "\n");
        }
        System.out.print(sb);
    }
}
