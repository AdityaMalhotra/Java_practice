import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversingWords
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String str[] = br.readLine().trim().split("\\.");

            StringBuffer result = new StringBuffer();

            for(int i=str.length-1;i>0;i--)
            {
                result.append(str[i] + ".");
            }
            result.append(str[0]);

            System.out.println(result);
        }
    }

}
