import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            String[] input = br.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input[0]);
            int n = Integer.parseInt(input[1]);

            for(int i=m;i<=n;i++)
            {
                Set<Integer> set = new HashSet<>();
                int number = i;
                boolean flag = true;
                while(number>0)
                {
                    int digit = number%10;
                    if(set.contains(digit))
                    {
                        flag = false;
                        break;
                    }
                    else
                        set.add(digit);
                    number=number/10;
                }
                if(flag)
                    sb.append(i + " ");
            }

            sb.append("\n");
        }
        System.out.print(sb);
    }
}
