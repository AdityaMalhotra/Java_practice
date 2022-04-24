public class FindDigits
{
    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }
    // Complete the findDigits function below.
    static int findDigits(int n) {
        int temp = n;
        int digit;
        int count = 0;
        while(temp>0)
        {
            digit = temp%10;
            temp = temp/10;
            if(digit!=0 && n%digit == 0)
            {
                count++;
            }
        }
        return count;

    }
}
