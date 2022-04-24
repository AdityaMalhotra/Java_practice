package recursion;

import java.io.IOException;

public class ProductOfTwoNums
{
    public static void main(String[] args) throws IOException {
        int x = 2;
        int y = 3;
        int result = calculate(x,y,0);
        System.out.println(result);
    }
    public static int calculate(int x,int y,int result)
    {
        if(y--<=0)
        {
            return result;
        }
        return calculate(x,y,result+x);
    }
}
