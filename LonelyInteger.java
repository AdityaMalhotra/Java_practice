import java.util.Arrays;

public class LonelyInteger
{
    public static void main(String[] args) {
        int[] a = {0,0,1,2,1};
        System.out.println(lonelyinteger(a));
    }
    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] a) {
       int[] count = new int[101];
       int lonelyInteger = 0;
       Arrays.fill(count,0);
       for(int i=0;i<a.length;i++)
       {
           count[a[i]]++;
       }
       for(int i=0;i<count.length;i++)
       {
           if(count[i] == 1)
           {
               lonelyInteger = i;
           }
       }
       return lonelyInteger;
    }
}
