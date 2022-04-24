import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LongestCommonPrefix
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String prefix = "";
            HashMap<String,Integer> hashMap = new HashMap<>();

            String s1 = br.readLine().trim();
            String s2 = br.readLine().trim();
            int n = s1.length();
            int m = s2.length();
            int index = -1;
            int i=0;
            int j=0;
            boolean flag = false;

            while(i<n && j<m)
            {
                if((s1.charAt(i) == s2.charAt(j))) {
                    prefix+=s1.charAt(i);
                    if(!flag)
                        index = j;
                    flag = true;
                    i++;
                }
                else if(s1.charAt(i)!=s2.charAt(j) && flag)
                {
                    i=0;
                    if(!hashMap.containsKey(prefix))
                        hashMap.put(prefix,index);

                    prefix = "";
                    flag = false;
                }
                j++;
            }
            if(prefix.length()!=0 && !hashMap.containsKey(prefix))
                hashMap.put(prefix,index);

            if(hashMap.keySet().size()==0)
                System.out.println(-1);
            else{
                int max = 0;
                String maxStr = "";
                for(String str : hashMap.keySet())
                {
                    if(str.length()>max) {
                        maxStr = str;
                        max = str.length();
                    }
                }
                System.out.println(hashMap.get(maxStr) + " " + maxStr);
            }
        }
    }
}
