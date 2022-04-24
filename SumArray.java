import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumArray
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
                arr[i] = Integer.parseInt(input[i]);

            long sumEven = 0;
            long sumOdd = 0;
            for(int i=0;i<n;i++)
            {
                if(i%2==0)
                    sumEven+=arr[i];
                else
                    sumOdd+=arr[i];

                sb.append(Math.max(sumEven,sumOdd) + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
