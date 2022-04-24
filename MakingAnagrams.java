import java.util.HashMap;

public class MakingAnagrams
{
    public static void main(String[] args) {
        System.out.println(makingAnagrams("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
        int result;
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            Character ch = s1.charAt(i);
            if(hashMap.containsKey(ch))
            {
                hashMap.put(ch,hashMap.get(ch)+1);
            }
            else
            {
                hashMap.put(ch,1);
            }
        }
        int deletionsNeededInS2 = 0;
        int deletionsNeededInS1 = 0;
        for(int j=0;j<s2.length();j++)
        {
            Character ch = s2.charAt(j);
            if(hashMap.containsKey(ch) && hashMap.get(ch)>0)
            {
                hashMap.put(ch,hashMap.get(ch)-1);
            }
            else
            {
                deletionsNeededInS2++;
            }
        }
        for(int i : hashMap.values())
        {
                deletionsNeededInS1+=i;
        }
        if(s1.length()-s2.length() > deletionsNeededInS1)
        {
            deletionsNeededInS1 = s1.length() - s2.length();
        }
        else if(s2.length() - s1.length() > deletionsNeededInS2)
        {
            deletionsNeededInS2 = s2.length() - s1.length();
        }
        result = deletionsNeededInS1 + deletionsNeededInS2;
        return result;
    }
}
