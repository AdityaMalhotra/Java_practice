public class SeparateTheNumbers
{
    public static void main(String[] args) {

    }
    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {
        long firstNum = -1;
        boolean valid = false;
        for(int i=1;i<=s.length()/2;i++)
        {
            String test = s.substring(0,i);
            Long number = Long.parseLong(test);
            firstNum = number;
            while(test.length()<s.length())
            {
                test+=Long.toString(++number);
            }
            if(test.equals(s))
            {
                valid = true;
                break;
            }
        }
        System.out.println(valid?"YES " + firstNum : "NO");
    }
}
