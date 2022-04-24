import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquaresInAMatrix
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb  = new StringBuffer();
        while(t-- > 0)
        {
            String[] input = br.readLine().trim().split("\\s+");
            long m = Integer.parseInt(input[0]);
            long n = Integer.parseInt(input[1]);
            long sum = 0;
            while(m>0 && n>0)
            {
                sum = sum + m*n;
                m--;
                n--;
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
