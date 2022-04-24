import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingElement
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String input[] = br.readLine().trim().split("\\s+");
            HashMap<String,Integer> hashMap = new LinkedHashMap<>();
            for(int i=0;i<n;i++)
            {
                if(hashMap.containsKey(input[i]))
                    hashMap.put(input[i],hashMap.get(input[i]) + 1);
                else
                    hashMap.put(input[i],1);
            }
            boolean flag = false;
            for(Map.Entry<String,Integer> entry : hashMap.entrySet())
            {
                if(entry.getValue()==1)
                {
                    flag = true;
                    sb.append(entry.getKey());
                    break;
                }
            }
            if(!flag)
                sb.append(0);

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
