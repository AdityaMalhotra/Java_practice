import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Transmutation
{
    public static HashMap<Integer,Integer> hm = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int steps = compute(n,0);
            hm.put(n,steps);
            sb.append(steps + "\n");
        }
        System.out.println(sb);
    }
    public static int compute(int n,int steps)
    {
        if(n==1)
        {
            return steps;
        }
        else if(hm.containsKey(n))
        {
            return hm.get(n);
        }
        else
        {
            if(n%2==0)
                return compute(n/2,steps+1);
            else
                return compute(n-1,steps+1);
        }
    }
}
