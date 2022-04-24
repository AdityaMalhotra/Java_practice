import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrailingZeroes
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int count=0;
            int i=1;
            while(Math.pow(5,i)<=n)
            {
                count+=n/(Math.pow(5,i));
                i++;
            }
            sb.append(count + "\n");
        }
        System.out.println(sb);
    }
}
