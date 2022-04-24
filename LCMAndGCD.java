import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LCMAndGCD
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            String[] input = br.readLine().trim().split("\\s+");
            long x = Integer.parseInt(input[0]);
            long y = Integer.parseInt(input[1]);
            long lcm;
            long gcd;

            BigInteger bg1 = new BigInteger(x + "");
            BigInteger bg2 = new BigInteger(y + "");

            gcd = bg1.gcd(bg2).longValue();
            lcm = (x*y)/gcd;
            sb.append(lcm + " " + gcd + "\n");
        }
        System.out.println(sb);
    }
}
