import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Isogram
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            String str = br.readLine().trim();
            boolean flag = true;
            HashMap<Character,Integer> hashMap = new HashMap<>();
            for(int i=0;i<str.length();i++)
            {
                if(hashMap.containsKey(str.charAt(i)))
                {
                    flag = false;
                    break;
                }
                else
                    hashMap.put(str.charAt(i),1);
            }
            if(flag)
                sb.append(1);
            else
                sb.append(0);

            sb.append("\n");
        }
        System.out.println(sb);
    }
}
