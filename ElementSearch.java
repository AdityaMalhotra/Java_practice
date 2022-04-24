import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ElementSearch
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] inputLine2 = br.readLine().trim().split("\\s+");
            int x = Integer.parseInt(br.readLine().trim());
            boolean flag = false;
            for(int i=0;i<n;i++)
            {
                if(Integer.parseInt(inputLine2[i]) == x)
                {
                    flag = true;
                    System.out.println(i);
                    break;
                }
            }
            if(!flag)
                System.out.println(-1);
        }
    }
}
