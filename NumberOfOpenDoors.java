import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfOpenDoors
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long count = (long)Math.floor(Math.sqrt(n));
            sb.append(count + "\n");
        }
        System.out.print(sb);
    }
}
