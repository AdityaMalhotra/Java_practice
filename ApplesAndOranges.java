public class ApplesAndOranges
{
    public static void main(String[] args)
    {
        int apples[] = {-2,2,1};
        int oranges[] = {5,-6};
        countApplesAndOranges(7,11,5,15, apples,oranges);
    }
    /*
        O(n+m) Solution to https://www.hackerrank.com/challenges/apple-and-orange/problem
     */
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int apple_count = 0;
        int orange_count = 0;
            for(int i =0;i<apples.length;i++)
            {
                apples[i] = apples[i] + a;
                if(apples[i]<=t && apples[i]>=s)
                {
                    apple_count++;
                }
            }
            for(int j=0;j<oranges.length;j++)
            {
                oranges[j] = oranges[j] + b;
                if(oranges[j]<=t && oranges[j]>=s)
                {
                    orange_count++;
                }
            }
            System.out.println(apple_count);
            System.out.print(orange_count);



    }
}
