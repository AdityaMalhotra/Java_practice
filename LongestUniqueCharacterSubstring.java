import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestUniqueCharacterSubstring
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            char[] s = br.readLine().trim().toCharArray();
            int k = Integer.parseInt(br.readLine().trim());
            int count = 0;
            int max = 0;
            int left = 0;
            int[] map = new int[26];
            for(int right = 0; right < s.length; right++){
                map[s[right] - 'a']++;
                if(map[s[right] - 'a'] == 1) count++;
                if(count > k){
                    while(--map[s[left++] - 'a'] > 0);
                    count--;
                }
                max = Math.max(max, right - left + 1);
            }
            if(count!=k) max = -1;
            sb.append(max + "\n");
        }
        System.out.print(sb);
    }
}
