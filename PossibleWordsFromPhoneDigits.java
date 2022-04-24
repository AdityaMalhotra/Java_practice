import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PossibleWordsFromPhoneDigits
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<t;i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String inputLine3[] = br.readLine().trim().split("\\s+");
            int[] D = new int[n];
            for(int j = 0;j<n;j++)
            {
                D[j] = Integer.parseInt(inputLine3[j]);
            }
            String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

            List<String> list = new ArrayList<>();

            calculatePossibleCombinations(D,0,"",list, map);

            StringBuffer sb = new StringBuffer();

            for(String listItem : list)
            {
                sb.append(listItem + " ");
            }
            System.out.println(sb);
        }
    }
    public static void calculatePossibleCombinations(int[] D,int i,String string,List<String> list, String[] map)
    {
        if(i==D.length) {
            list.add(string);
            return;
        }
        String s = map[D[i]];
        for(int j = 0;j<s.length();j++)
        {
            calculatePossibleCombinations(D,i+1,string + s.charAt(j),list,map);
        }
    }
}
