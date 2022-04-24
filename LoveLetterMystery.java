public class LoveLetterMystery
{
    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("abcba"));
    }
    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
        int count = 0;
        int i=0;
        int j=s.length()-1;
        while(i<=s.length()/2-1)
        {
            count+=Math.abs(s.charAt(i++) - s.charAt(j--));
        }
        return count;

    }
}
