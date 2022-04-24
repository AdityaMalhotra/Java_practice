import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwappingPairs
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String line1[] = br.readLine().trim().split("\\s+");
            String line2[] = br.readLine().trim().split("\\s+");
            String line3[] = br.readLine().trim().split("\\s+");

            int n = Integer.parseInt(line1[0]);
            int m = Integer.parseInt(line1[1]);
            int[] arr1 = new int[n];
            int sum1 = 0;
            int[] arr2 = new int[m];
            int sum2 = 0;
            for(int i=0;i<n;i++)
            {
                arr1[i] = (Integer.parseInt(line2[i]));
                sum1+=arr1[i];
            }
            for(int i=0;i<m;i++)
            {
                arr2[i] = Integer.parseInt(line3[i]);
                sum2+=arr2[i];
            }
            int i=0;
            int j=0;
            boolean flag = false;
            while(i<n && j<m)
            {
                if(Math.abs(arr1[i]-arr2[j]) == (Math.abs(sum1-sum2)/2))
                {
                    flag = true;
                    break;
                }
                else if(arr1[i] > arr2[j])
                    i++;
                else
                    j++;
            }
            if(flag)
                sb.append(1);
            else
                sb.append(-1);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
