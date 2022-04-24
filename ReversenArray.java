import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversenArray
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int n = Integer.parseInt(br.readLine());
            String[] arrString = br.readLine().trim().split("\\s+");
            StringBuffer sb = new StringBuffer();
            for(int j=n-1;j>=0;j--)
            {
                sb.append(arrString[j] + " ");
            }
            System.out.println(sb);
        }
    }
}
