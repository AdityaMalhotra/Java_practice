import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestDistinctWindow
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            String s = br.readLine().trim();
            int[] letterCount = new int[128];
            int left = 0;
            int count = 0;
            int minLength = Integer.MAX_VALUE;
            for(char c : s.toCharArray())
                ++letterCount[c];
            for(int right = 0;right<s.length();++right)
            {
                if(--letterCount[s.charAt(right)] >=0)
                    ++count;
                while(count==s.length()) {
                    if (minLength > right - left + 1) {
                        minLength = right - left + 1;
                    }
                    if (++letterCount[s.charAt(left)] > 0)
                        --count;
                    ++left;
                }
            }
            sb.append(minLength + "\n");
        }
        System.out.print(sb);
    }
}
