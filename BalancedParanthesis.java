import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedParanthesis
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String str = br.readLine().trim();
            if(checkBalance(str))
                System.out.println("Balanced");
            else
                System.out.println("Unbalanced");
        }
    }
    public static boolean checkBalance(String s)
    {
        int counter = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '{')
            {
                counter++;
            }
            else if(s.charAt(i) == '}')
            {
                counter--;
            }
            if(counter<0)
            {
                return false;
            }
        }
        if(counter == 0)
            return true;
        else
            return false;
    }
}
