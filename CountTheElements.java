import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountTheElements
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] a = br.readLine().trim().split("\\s+");
            String[] b = br.readLine().trim().split("\\s+");
            int q = Integer.parseInt(br.readLine().trim());
            int[] arr_b = new int[n];
            for(int i=0;i<n;i++)
            {
                arr_b[i] = Integer.parseInt(b[i]);
            }
            int count;
            for(int i=0;i<q;i++)
            {
                int index = Integer.parseInt(br.readLine().trim());
                int a_element = Integer.parseInt(a[index]);
                count = 0;
                for(int j=0;j<n;j++)
                {
                    if(arr_b[j]<= a_element)
                    {
                        count++;
                    }
                }
                sb.append(count + "\n");
            }

        }
        System.out.print(sb);
    }
}
