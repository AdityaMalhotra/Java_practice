import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseDigits
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb =  new StringBuffer();
        while(t-- > 0)
        {
            long n = Long.parseLong(br.readLine().trim());
            String str = reverse(n,"");
            sb.append(Long.parseLong(str) + "\n");
        }
        System.out.println(sb);
    }
    public static String reverse(long n,String str)
    {
        if(n==0)
            return str;
        else {
            long digit = n % 10;
            str+=digit;
            n = n / 10;
            return reverse(n,str);
        }
    }
}
