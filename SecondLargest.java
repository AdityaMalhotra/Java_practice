import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondLargest
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input1 = br.readLine().trim().split("\\s+");
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = Integer.parseInt(input1[i]);

            Arrays.sort(arr);
            int i;
            for(i=n-2;i>=0;i--)
            {
                if(arr[i]!=arr[i+1])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
            if(i==-1)
                System.out.println(arr[0]);
        }
    }
}
