public class HackerRankInAString
{
    public static void main(String[] args) {
        System.out.println(hackerrankInString("hhaacckkekraraannk"));
    }
    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String str = "hackerrank";
        if(s.length() < str.length())
        {
            return "NO";
        }
        int i = 0;
        int j = 0;
        while(j<s.length())
        {
            if (i<str.length() && s.charAt(j) == str.charAt(i)) {
                i++;
            }
            j++;
        }
        return i==str.length()?"YES" : "NO";
    }
}
