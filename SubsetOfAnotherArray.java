import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SubsetOfAnotherArray
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            String input1[] = br.readLine().trim().split("\\s+");
            String input2[] = br.readLine().trim().split("\\s+");
            String input3[] = br.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input1[0]);
            int n = Integer.parseInt(input1[1]);

            HashMap<String,Boolean> hashMap = new HashMap<>();
            for(int i=0;i<m;i++)
            {
                hashMap.put(input2[i],true);
            }
            boolean flag = true;
            for(int i=0;i<n;i++)
            {
                if(!hashMap.containsKey(input3[i]))
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
                sb.append("Yes");
            else
                sb.append("No");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
