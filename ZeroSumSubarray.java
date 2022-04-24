import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ZeroSumSubarray
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split("\\s+");
            HashMap<Long,Integer> hm = new HashMap<>();
            long a[] = new long[n];
            long sum = 0;
            int count = 0;
            for(int i=0;i<n;i++) {
                a[i] = Long.parseLong(str[i]);
                sum+=a[i];
                if(sum == 0)
                {
                    count++;
                }
                if(hm.containsKey(sum))
                {
                    count+=hm.get(sum);
                }
                if(hm.containsKey(sum))
                    hm.put(sum,hm.get(sum) + 1);
                else
                    hm.put(sum,1);
            }
            sb.append(count + "\n");
        }
        System.out.print(sb);
    }
}
