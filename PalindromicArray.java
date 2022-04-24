import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromicArray
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split("\\s+");
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = Integer.parseInt(input[i]);
            }
            int count = 0;
            int i = 0;
            int j=n-1;
            int iSum = arr[i];
            int jSum = arr[j];

            while(i<j)
            {
                if(iSum==jSum)
                {
                    iSum = arr[i+1];
                    jSum = arr[j-1];
                    i++;
                    j--;
                }
                else if(iSum>jSum)
                {
                    count++;
                    jSum+=arr[j-1];
                    j--;
                }
                else
                {
                    count++;
                    iSum+=arr[i+1];
                    i++;
                }
            }
            sb.append(count + "\n");
        }
        System.out.print(sb);
    }
}
