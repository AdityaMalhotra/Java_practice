import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestWindow
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(tc-- > 0)
        {
            String s = br.readLine().trim();
            String t = br.readLine().trim();
            String res = "";
            int count = 0;
            int left = 0;
            int[] charCount = new int[26];
            int minLength = Integer.MAX_VALUE;
            for(char c : t.toCharArray())
            {
                charCount[c - 'a']++;
            }
            for(int right = 0;right<s.length();right++)
            {
                if(--charCount[s.charAt(right) - 'a'] >=0)
                    count++;
                while(count==t.length())
                {
                    if(minLength>right-left+1)
                    {
                        res = s.substring(left,right+1);
                        minLength = right-left+1;
                    }
                    if(++charCount[s.charAt(left) - 'a']>0)
                        count--;
                    left++;
                }
            }
            if(res!="")
                sb.append(res + "\n");
            else
                sb.append(-1 + "\n");
        }
        System.out.print(sb);
    }
}
