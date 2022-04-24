import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Function
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int  t = Integer.parseInt(br.readLine());
        for(int i = 0;i<t;i++)
        {
            int n = Integer.parseInt(br.readLine());
            StringBuffer sb = new StringBuffer();
            sb.append(f(n));
            System.out.println(sb);
        }
    }
    public static int f(int x)
    {
        if(x == 0)
        {
            return 1;
        }
        return f(x-1) - 1;
    }
}
