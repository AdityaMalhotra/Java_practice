import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class GroupingAnagramsTogether
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        StringBuffer sb =new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split("\\s+");
            TreeMap<String,Integer> hm = new TreeMap<String,Integer>();
            for(int i=0;i<input.length;i++)
            {
                int[] arr = new int[26];
                char[] carr = input[i].toCharArray();

                for(int j=0;j<carr.length;j++)
                {
                    arr[carr[j]-'a']++;
                }

                String s = "";
                for(int j=0;j<26;j++)
                {
                    if(arr[j] > 0)
                    {
                        for(int k=0;k<arr[j];k++)
                        {
                            char c = (char)('a' + j);
                            s=s+c;
                        }
                    }
                }
                System.out.println(s);
                int count = 0;
                if(hm.containsKey(s))
                {
                    count=hm.get(s) + 1;
                }
                else
                    count = 1;

                hm.put(s,count);
            }
            String s = "";
            Iterator hmIterator = hm.entrySet().iterator();
            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) hmIterator.next();
                s = mapElement.getValue() + " " + s;
            }
            sb.append(s + "\n");
        }
        System.out.println(sb);
    }
}
