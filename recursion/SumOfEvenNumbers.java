package recursion;

public class SumOfEvenNumbers
{
    public static int[] arr = {1,2,3,4,5,6,7,8};

    public static void main(String[] args) {
        System.out.println(solve(0,0));

    }
    private static int solve(int num,int sum)
    {
        if(num>=arr.length)
            return sum;

        if(arr[num]%2==0)
            sum+=arr[num];

        return solve(num+1,sum);
    }
}
