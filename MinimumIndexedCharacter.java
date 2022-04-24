import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MinimumIndexedCharacter
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-->0)
        {
            String str = br.readLine().trim();
            String patt = br.readLine().trim();
            String result = minIndexCalc(str,patt);
            if(result!="")
                sb.append(result);
            else
                sb.append("$");
            sb.append("\n");
        }
        System.out.print(sb);
    }
    public static String minIndexCalc(String str,String patt)
    {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), i);
            }
        }
        int min = str.length();
        String res = "";
        for(int i=0;i<patt.length();i++)
        {
            if(hashMap.containsKey(patt.charAt(i)))
            {
                if(min>hashMap.get(patt.charAt(i)))
                {
                    min = hashMap.get(patt.charAt(i));
                    res = patt.charAt(i)+"";
                }
            }
        }
        return res;
    }
}
