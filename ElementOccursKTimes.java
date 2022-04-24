import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ElementOccursKTimes
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            String[] inputLine1 = br.readLine().trim().split("\\s+");
            String[] inputLine2 = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(inputLine2[i]);
            }
            HashMap<Integer,Integer> hm = new HashMap<>();
            int result = -1;
            for(int i=0;i<n;i++)
            {
                int count;
                if(hm.containsKey(arr[i]))
                {
                    count = hm.get(arr[i]) + 1;
                }
                else {
                    count = 1;
                }
                hm.put(arr[i],count);
            }
            for(int i=0;i<n;i++)
            {
                if(hm.get(arr[i]) == k)
                {
                    result = arr[i];
                    break;
                }
            }
            sb.append(result + "\n");
        }
        System.out.print(sb);
    }
}
