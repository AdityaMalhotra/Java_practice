import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfTwo
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            long n = Long.parseLong(br.readLine().trim());
            int i = 0;
            String result = "NO";
            while(Math.pow(2,i)<=n)
            {
                if(Math.pow(2,i)== n) {
                    result = "YES";
                    break;
                }
                i++;
            }
            System.out.println(result);
        }
    }
}
