import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SieveOfErastothenis
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Boolean[] list = new Boolean[n+1];

            Arrays.fill(list,true);

            for(int i = 2;i<=n;i++)
            {
                boolean numberToCheck = list[i];
                if(numberToCheck)
                {
                    sb.append(i + " ");
                    for(int j = i;j<=n;j+=i)
                    {
                        list[j] = false;
                    }
                }
            }
            sb.append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
