import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CountDistinct
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        for(int i=0;i<t;i++)
        {
            String[] secondInputs = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(secondInputs[0]);
            int k = Integer.parseInt(secondInputs[1]);

            String[] arrInput = br.readLine().trim().split("\\s+");
            int[] a = new int[n];
            for(int j=0;j<n;j++)
                a[j] = Integer.parseInt(arrInput[j]);

            //Main logic
            HashSet<Integer> hashSet;
            int left = 0;
            int right = k-1;

            StringBuffer sb = new StringBuffer();

            while(right< a.length)
            {
                hashSet = new HashSet<>();
                for(int x = left;x<=right;x++)
                {
                    hashSet.add(a[x]);
                }
                left++;
                right++;

                sb.append(hashSet.size() + " ");
            }
            System.out.println(sb);
        }
    }
}
