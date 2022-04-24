package recursion;
/*
    Solving f(n)= (1) + (2*3) + (4*5*6) … n using recursion
 */
public class Series2
{
    public static void main(String[] args) {
        int n=4;
        System.out.println(solve(1,1,n));
    }
    public static long solve(int calculated, int current, int n)
    {
        if(current>n)
            return 0;
        int i,cur = 1;
        for(i=calculated;i<calculated+current;i++)
        {
            cur*=i;
        }
        return cur + solve(i,current+1,n);
    }
}
