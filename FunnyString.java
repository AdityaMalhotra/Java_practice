public class FunnyString
{
    public static void main(String[] args) {
        System.out.println(funnyString("lmnop"));
    }
    // Complete the funnyString function below.
    static String funnyString(String s) {
        String reverse = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse+=s.charAt(i);
        }
        for(int j=0;j<s.length()-1;j++)
        {
            int diff1 = Math.abs(s.charAt(j) - s.charAt(j+1));
            int diff2 = Math.abs(reverse.charAt(j) - reverse.charAt(j+1));
            if(diff1!=diff2)
            {
                return "Not Funny";
            }
        }
        return "Funny";
    }
}
