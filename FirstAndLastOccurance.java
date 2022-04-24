import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstAndLastOccurance
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] inputLine = br.readLine().trim().split("\\s+");
            long[] arr = new long[n];
            long x = Integer.parseInt(br.readLine().trim());
            int firstPosition = -1;
            int lastPosition = -1;

            boolean flag = false;
            for(int i = 0;i<n;i++)
            {
                arr[i] = Integer.parseInt(inputLine[i]);
                if(arr[i] == x && !flag)
                {
                    flag = true;
                    firstPosition = i;
                    lastPosition = i;
                    continue;
                }
                if(flag && arr[i]!=arr[firstPosition])
                {
                    lastPosition = i-1;
                    break;
                }
            }
            if(arr[n-1] == x)
                lastPosition = n-1;
            if(firstPosition == -1)
                System.out.println(-1);
            else
                System.out.println(firstPosition + " " + lastPosition);
        }
    }
}
