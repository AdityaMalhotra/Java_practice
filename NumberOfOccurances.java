import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfOccurances
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String[] input1 = br.readLine().trim().split("\\s+");
            String[] input2 = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input1[0]);
            int x = Integer.parseInt(input1[1]);

            boolean flag = false;
            int numberOfOccurances = 0;
            for(int i = 0;i<n;i++)
            {
               int element = Integer.parseInt(input2[i]);
                if(element == x)
                {
                    numberOfOccurances++;
                }
            }
            if(numberOfOccurances==0)
                numberOfOccurances = -1;
            System.out.println(numberOfOccurances);
        }
    }
}
