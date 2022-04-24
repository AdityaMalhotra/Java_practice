import java.util.HashMap;

public class GameOfThrones
{
    public static void main(String[] args) {
        System.out.println(gameOfThrones("aaabbbb"));
    }
    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {

        HashMap<Character,Integer> hashMap = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++)
        {
            Character currentChar = s.charAt(i);
            hashMap.put(currentChar,hashMap.containsKey(currentChar)?hashMap.get(currentChar) + 1 : 1);
        }
        if(s.length()%2==0)
        {
            for(Integer j : hashMap.values())
            {
                if(j%2!=0)
                {
                    return "NO";
                }
            }
        }
        else
        {
            boolean flag = false;
            for(Integer j : hashMap.values())
            {
                if(j%2!=0 && !flag)
                {
                    flag = true;
                }
                else if (j%2!=0 && flag)
                {
                    return "NO";
                }
            }
            if(flag)
            {
                return "YES";
            }
        }
        return "YES";
    }
}
