import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EquilibriumPoint
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] inputLine = br.readLine().trim().split("\\s+");
            int sum = 0;
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(inputLine[i]);
                sum+=arr[i];
            }

            int leftSum = 0;
            for(int i=0;i<n;i++)
            {
                if(sum-arr[i]- leftSum==leftSum) {
                    System.out.println(i+1);
                    break;
                }
                else
                {
                    leftSum+=arr[i];
                }
            }
            if(leftSum==sum)
                System.out.println(-1);
        }
    }

}
