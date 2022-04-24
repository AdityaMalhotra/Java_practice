import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImmediateSmaller
{
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.parseInt(br.readLine());
            for(int i=0;i<testCases;i++)
            {
                Integer n = Integer.parseInt(br.readLine());
                Integer[] arr = new Integer[n];
                String line = br.readLine();
                String[] strs = line.trim().split("\\s+");

                for(int j=0;j<n;j++)
                {
                    arr[j] = Integer.parseInt(strs[j]);
                }
                StringBuffer sb = new StringBuffer();
                for(int j=0;j<n;j++)
                {
                    if(j<n-1)
                    {
                        if(arr[j+1]<arr[j])
                        {
                            sb.append(arr[j+1] + " ");
                        }
                        else
                            sb.append(-1 + " ");
                    }
                }
                sb.append(-1);
                System.out.println(sb);
            }
            br.close();
    }
}
