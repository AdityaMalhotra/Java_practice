import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AbsoluteDifferenceOfOne
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t  = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String[] inputLine1 = br.readLine().trim().split("\\s+");
            String[] inputLine2 = br.readLine().trim().split("\\s+");

            int n = Integer.parseInt(inputLine1[0]);
            int k = Integer.parseInt(inputLine1[1]);

            long arr[] = new long[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = Long.parseLong(inputLine2[i]);
            }
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<n;i++)
            {
                if(arr[i]<k && (arr[i] + "").length()!=1)
                {
                     long num1 = arr[i];
                     int prevDigit = -1;
                     while (num1 > 0)
                     {
                        int digit = (int)num1%10;
                        if(prevDigit!=-1)
                        {
                            if(Math.abs(prevDigit-digit) != 1)
                            {
                                break;
                            }
                            else
                            {
                                prevDigit = digit;
                            }
                        }
                        else
                        {
                            prevDigit = digit;
                        }
                        num1 = num1/10;
                     }
                     if(num1==0)
                        sb.append(arr[i] + " ");
                }
            }
            if(sb.length()==0)
            {
                sb.append(-1);
            }
            System.out.println(sb);
        }
    }
}
