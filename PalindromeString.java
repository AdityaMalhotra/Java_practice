import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeString
{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();

            int start = 0;
            int end = n-1;

            while(start<end)
            {
                if(str.charAt(start)!=str.charAt(end))
                {
                    System.out.println("No");
                    break;
                }
                start++;
                end--;
            }
            if(start>=end)
            {
                System.out.println("Yes");
            }
        }
    }

}
