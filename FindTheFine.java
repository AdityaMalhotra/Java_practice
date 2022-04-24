import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheFine
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for(int x = 0;x<t;x++)
        {
            String[] inputLine2 = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inputLine2[0]);
            int d = Integer.parseInt(inputLine2[1]);
            String[] inputLine3 = br.readLine().trim().split("\\s+");
            String[] inputLine4 = br.readLine().trim().split("\\s+");

            int carNums[] = new int[n];
            int penalties[] = new int[n];

            for(int i = 0;i<n;i++)
                carNums[i] = Integer.parseInt(inputLine3[i]);
            for(int i = 0;i<n;i++)
                penalties[i] = Integer.parseInt(inputLine4[i]);

            int result = calculateFine(n,d,carNums,penalties);

            System.out.println(result);

        }
    }
    public static int calculateFine(int n, int d, int[] carNums, int[] penalties)
    {
        int sum = 0;

        if(d%2==0)
        {
            for(int i=0;i<n;i++)
            {
                if(carNums[i]%2!=0)
                {
                    sum+=penalties[i];
                }
            }
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(carNums[i]%2==0)
                {
                    sum+=penalties[i];
                }
            }
        }

        return sum;
    }
}
