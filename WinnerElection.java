import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class WinnerElection
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split("\\s+");
            HashMap<String,Integer> hashMap = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(hashMap.containsKey(input[i]))
                {
                    hashMap.put(input[i],hashMap.get(input[i]) + 1);
                }
                else
                    {
                    hashMap.put(input[i], 1);
                }
            }
            int max = 0;
            String winner = "";
            for(String str : hashMap.keySet())
            {
                if(hashMap.get(str) > max) {
                    max = hashMap.get(str);
                    winner = str;
                }
                else if(hashMap.get(str) == max)
                {
                    if(winner.compareTo(str)>0)
                    {
                        winner = str;
                    }
                }
            }
            sb.append(winner + " " + max + "\n");
        }
        System.out.println(sb);
    }
}
