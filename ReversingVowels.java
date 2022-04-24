import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReversingVowels
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String str = br.readLine().trim();
            List<Character> charList = new ArrayList<>();
            charList.add('a');
            charList.add('e');
            charList.add('i');
            charList.add('o');
            charList.add('u');

            int left = 0;
            int right = str.length()-1;
            boolean leftFlag = false;
            boolean rightFlag = false;
            char[] charArr = new char[str.length()];

            while(left<=right && right>0 && left<str.length())
            {
                if(!leftFlag)
                {
                    if(charList.contains(str.charAt(left)))
                    {
                        leftFlag = true;
                    }
                    else {
                        charArr[left] = str.charAt(left);
                        left++;
                    }
                }
                if(!rightFlag)
                {
                    if(charList.contains(str.charAt(right)))
                    {
                        rightFlag = true;
                    }
                    else {
                        charArr[right] = str.charAt(right);
                        right--;
                    }
                }
                if(leftFlag && rightFlag)
                {
                    charArr[left] = str.charAt(right);
                    charArr[right] = str.charAt(left);
                    leftFlag = false;
                    rightFlag = false;
                    left++;
                    right--;
                }
            }
            String result = "";
            for(int i=0;i<charArr.length;i++)
                result+=charArr[i];

            System.out.println(result);
        }
    }
}
