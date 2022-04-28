import java.util.HashMap;

public class Anagram
{
    public static void main(String[] args) {
        System.out.println(anagram("fdhlvosfpafhalll"));
    }
    /*
        Solution to https://www.hackerrank.com/challenges/anagram/problem using Hashmap
        Time - O(n)
        Space - O(n)
     */
    // Complete the anagram function below.
    static int anagram(String s) {
        if(s.length()%2!=0)
        {
            return -1;
        }
        String left = s.substring(0,s.length()/2);
        String right = s.substring(s.length()/2);

        int count = 0;
        HashMap<Character,Integer> hashmap = new HashMap();
        Character ch;
        for(int i=0;i<left.length();i++)
        {
            ch = left.charAt(i);
            if(hashmap.containsKey(ch))
            {
                hashmap.put(ch,hashmap.get(ch)+1);
            }
            else
            {
                hashmap.put(ch,1);
            }
        }
        for(int j=0;j<right.length();j++)
        {
            ch = right.charAt(j);
            if(hashmap.containsKey(ch) && hashmap.get(ch)>0)
            {
                hashmap.put(ch,hashmap.get(ch)-1);
            }
            else
            {
                count++;
            }
        }
        return count;
    }
}
