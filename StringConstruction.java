public class StringConstruction
{
    public static void main(String[] args) {
        System.out.println(stringConstruction("abad"));
    }
    // Complete the stringConstruction function below.
    static int stringConstruction(String s) {
        boolean[] flag = new boolean[26];
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(!flag[s.charAt(i) - 'a']) {
                flag[s.charAt(i) - 'a'] = true;
                count++;
            }
        }
        return count;
    }
}
