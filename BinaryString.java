import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryString
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String str = br.readLine();

            int count = 0;

            for(int i=0;i<n;i++)
            {
                if(str.charAt(i)=='1')
                    count++;
            }
            System.out.println((count*(count-1))/2);
        }
    }

}
