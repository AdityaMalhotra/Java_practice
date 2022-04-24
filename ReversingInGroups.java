import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversingInGroups
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            String[] twoNums = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(twoNums[0]);
            int k = Integer.parseInt(twoNums[1]);

            String[] arrString = br.readLine().trim().split("\\s+");
            StringBuffer sb = new StringBuffer();
            int remainder = n%k;
            int j = 0;
            while(j<n)
            {
                if(j+k-1<n) {
                    for (int l = j + k-1;l>=j;l--)
                        sb.append(arrString[l] + " ");
                }
                j+=k;
            }
            for(j = n-1;j>=n-remainder;j--)
            {
                sb.append(arrString[j] + " ");
            }
            System.out.println(sb);
        }
    }
}
