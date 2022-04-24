import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintPattern
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            sequence(n);
            System.out.println();
        }
    }
    public static void sequence(int n)
    {
        if(n>0)
        {
            System.out.print(n + " ");
            sequence(n-5);
        }
        System.out.print(n + " ");
    }
}
