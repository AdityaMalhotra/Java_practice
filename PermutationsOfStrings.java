import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PermutationsOfStrings
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
           String s = br.readLine().trim();
           Set<String> result = permuteHelper(s,"",new HashSet<>());
           List<String> list = new ArrayList<>(result);
           StringBuffer sb = new StringBuffer();
           Collections.sort(list);
           for(String str  :list)
               sb.append(str + " ");

           System.out.println(sb);
        }
    }
    public static Set<String> permuteHelper(String s,String chosen,Set<String> set)
    {
     //   System.out.println("S: " + s + " Chosen : " + chosen);
        if(s.length()==0) {
            set.add(chosen);
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                char c = s.charAt(i);
                permuteHelper(s.substring(0,i) + s.substring(i+1),chosen+c,set);
            }
        }
        return set;
    }

}
