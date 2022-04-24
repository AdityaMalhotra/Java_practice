import java.util.ArrayList;
import java.util.List;

public class StrongPassword
{
    public static void main(String[] args) {
        System.out.println(minimumNumber(11,"#HackerRank"));
    }

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int result = 0;
        List<Character> numbers = convertStringToCharList("0123456789");
        List<Character> lower_case = convertStringToCharList("abcdefghijklmnopqrstuvwxyz");
        List<Character> upper_case = convertStringToCharList("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        List<Character> special_characters = convertStringToCharList("!@#$%^&*()-+");
        Boolean[] flags = {false,false,false,false};

        for(int i=0;i<n;i++)
        {
            if(numbers.contains(password.charAt(i)))
            {
                flags[0] = true;
            }
            else if(lower_case.contains(password.charAt(i)))
            {
                flags[1] = true;
            }
            else if(upper_case.contains(password.charAt(i)))
            {
                flags[2] = true;
            }
            else if(special_characters.contains(password.charAt(i)))
            {
                flags[3] = true;
            }
        }
        for(Boolean b : flags)
        {
            if(!b)
                result++;
        }

        result = 6-n > result ? 6-n : result;

        return result;
    }
    public static List convertStringToCharList(String str)
    {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }

        return chars;
    }
}
