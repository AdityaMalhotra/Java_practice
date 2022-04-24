import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerOfAnotherNumber
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String[] input = br.readLine().trim().split("\\s+");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            int result = 0;
            int i=0;
            while(Math.pow(x,i)<=y && x!=1)
            {
                if(Math.pow(x,i)==y)
                    result = 1;
                i++;
            }
            System.out.println(result);
        }
    }
}
