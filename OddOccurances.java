import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOccurances
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- >0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split("\\s+");
            int res = 0;
            for(int i=0;i<n;i++) {
                res = res ^ Integer.parseInt(str[i]);
            }
            sb.append(res + "\n");
        }
        System.out.print(sb);
    }
}
