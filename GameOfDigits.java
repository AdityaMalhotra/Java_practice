import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfDigits
{
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            int[] arr = {9,3,8,4,2,6,7,5};
            for(int i = 0;i<t;i++)
            {
                Long n = Long.parseLong(br.readLine());
                String result = "";

                for(int j : arr)
                {
                    if(n%j == 0)
                    {
                        String newNum = n+"";
                        if(newNum.length()==1)
                        {
                            result+=newNum;
                            n = 1L;
                            break;
                        }
                        n=n/j;
                        result+=j;
                    }
                }
            if(n!=1L)
                System.out.println(-1);
            else
                System.out.println(result);

            }
    }

}
