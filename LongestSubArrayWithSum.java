import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LongestSubArrayWithSum
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        HashMap<Integer,Integer> hm = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            String[] input1 = br.readLine().trim().split("\\s+");
            String[] input2 = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input1[0]);
            int k = Integer.parseInt(input1[1]);
            int[] arr = new int[n+1];
            for(int i=1;i<=n;i++)
                arr[i] = Integer.parseInt(input2[i-1]);

            int maxLength = 0;
            int sum = 0;
            hm.put(0,0);
            for(int i=1;i<=n;i++)
            {
                sum+=arr[i];
                if(hm.containsKey(sum-k))
                {
                    maxLength = Math.max(maxLength, i - hm.get(sum-k));
                }
                if(!hm.containsKey(sum))
                {
                    hm.put(sum,i);
                }
            }
            sb.append(maxLength + "\n");
            hm.clear();
        }
        System.out.print(sb);
    }
}
