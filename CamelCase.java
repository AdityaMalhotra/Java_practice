public class CamelCase
{
    public static void main(String[] args) {
        System.out.println(camelcase("oneTwoThree"));
    }
    // Complete the camelcase function below.
    static int camelcase(String s) {
        int count = 1;
        int i = 0;
        while(i<s.length())
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                count++;
            }
            i++;
        }
        return count;
    }
}
