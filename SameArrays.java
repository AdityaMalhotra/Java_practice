import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SameArrays
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] a = br.readLine().trim().split("\\s+");
            String[] b = br.readLine().trim().split("\\s+");

            HashMap<String,Integer> hm = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int count;
                if(hm.containsKey(a[i]))
                    count = hm.get(a[i]) + 1;
                else
                    count = 1;
                hm.put(a[i],count);
            }
            boolean flag = true;
            for(int i=0;i<n;i++)
            {
                if(hm.containsKey(b[i]) && hm.get(b[i]) > 0)
                {
                    hm.put(b[i],hm.get(b[i])-1);
                }
                else
                {
                   flag = false;
                   break;
                }
            }
            if(flag)
                sb.append(1);
            else
                sb.append(0);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
