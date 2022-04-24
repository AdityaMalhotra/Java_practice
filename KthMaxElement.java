import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class KthMaxElement
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            String[] input1 = br.readLine().trim().split("\\s+");
            String[] input2 = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input1[0]);
            int k = Integer.parseInt(input1[1]);
            Arrays.sort(input2, Collections.reverseOrder());
            sb.append(input2[k-1] + "\n");
//            if(k==1)
//            {
//                sb.append(input2[0] + "\n");
//                continue;
//            }
//            int[] arr = new int[n];

//            for(int i=0;i<n;i++)
//                arr[i] = Integer.parseInt(input2[i]);
//
//            int max = Integer.MIN_VALUE;
//            for(int i=(int)Math.pow(2,k-1); i< n && i<2*(int)(Math.pow(2,k-1));i++)
//            {
//                max = max>arr[i]?max:arr[i];
//            }
//            sb.append(max + "\n");
        }
        System.out.print(sb);
    }
}
