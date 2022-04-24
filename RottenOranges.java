import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RottenOranges
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String input1[] = br.readLine().trim().split("\\s+");
            String input2[] = br.readLine().trim().split("\\s+");
            int r = Integer.parseInt(input1[0]);
            int c = Integer.parseInt(input1[1]);

            for(int i=0;i<c;i++)
            {
                for(int j=0;j<r;j++)
                {

                }
            }
        }
    }
}
