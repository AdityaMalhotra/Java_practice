package recursion;

/*
    Given an integer n, the task is to find the sum of the series 1^1 + 2^2 + 3^3 + ….. + n^n using recursion.
 */
public class SumOfSeries {
    public static void main(String[] args) {
        int n = 3;
        int sum=0;
        System.out.println(calculateSeriesSum(n,sum));
    }
    public static int calculateSeriesSum(int n,int sum)
    {
        if(n<1)
        {
            return sum;
        }
        else
        {
            return calculateSeriesSum(n-1,(int)(sum+(Math.pow(n,n))));
        }
    }
}
