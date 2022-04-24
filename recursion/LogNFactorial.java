package recursion;
/*
    Given a number N, the task is to find the log value of the factorial of N i.e. log(N!).
 */
public class LogNFactorial {
    public static void main(String[] args) {
        int n = 3;
        int result = 0;
        System.out.println(calculate(n,result));
    }
    public static double calculate(int n,double result)
    {
        if(n<1)
        {
            return result;
        }
        return calculate(n-1,result+Math.log(n));
    }
}
