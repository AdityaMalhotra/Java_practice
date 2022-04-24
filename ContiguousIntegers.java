import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ContiguousIntegers
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split("\\s+");
            int arr[] = new int[n];
            HashMap<Integer,Boolean> hm = new HashMap<>();
            int min=Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(input[i]);
                hm.put(arr[i],true);
                if(min>arr[i])
                    min = arr[i];
                if(max<arr[i])
                    max = arr[i];
            }
            int i=min;
            boolean flag = true;
            while(i<=max)
            {
                if(!hm.containsKey(i))
                {
                    flag = false;
                    break;
                }
                i++;
            }
            if(flag)
                sb.append("Yes");
            else
                sb.append("No");

            sb.append("\n");

        }
        System.out.print(sb);
    }
}
