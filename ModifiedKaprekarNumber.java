public class ModifiedKaprekarNumber
{
    public static void main(String[] args) {
        kaprekarNumbers(1,100);
    }
    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        String sq;
        boolean flag = false;
        long square;
        for(long number = p;number<=q;number++)
        {
            square = number*number;
            sq = square + "";
            String left = sq.substring(0,sq.length()/2);
            String right = sq.substring(sq.length()/2);
            int numL = left.isEmpty()?0:Integer.parseInt(left);
            int numR = right.isEmpty()?0:Integer.parseInt(right);

            if (numL + numR == number) {
                System.out.print(number + " ");
                flag = true;
            }
        }
        if(flag == false)
        {
            System.out.println("INVALID RANGE");
        }
    }
}
