import java.util.ArrayList;
import java.util.List;

public class Pangrams
{
    public static void main(String[] args) {
        System.out.println(pangrams("All of the letters of the alphabet are present in the string."));
    }
    // Complete the pangrams function below.
    static String pangrams(String s) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = s.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<Character>();
        for(char ch : chars)
        {
            list.add(ch);
        }
        for(int i = 0;i<alphabets.length();i++)
        {
            if(!list.contains(alphabets.charAt(i)))
            {
                return "not pangram";
            }
        }
        return "pangram";

    }
}
