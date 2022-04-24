import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumOfPrimes
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long sum = 0;
            boolean[] list = new boolean[n+1];
            Arrays.fill(list,true);
            for(int i=2;i<=n;i++)
            {
                boolean prime = list[i];
                if(prime)
                {
                    sum+=i;
                    for(int j = i*2;j<=n;j+=i)
                    {
                        list[j] = false;
                    }
                }
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
