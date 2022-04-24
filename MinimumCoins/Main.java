package MinimumCoins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine().trim());
        int[] denominations = {1000,500,200,100,50,20,10,5,2,1};
        StringBuffer sb = new StringBuffer();
        int i=0;

        while(i<denominations.length)
        {
            if(x>=denominations[i])
            {
                x = x - denominations[i];
                sb.append(denominations[i] + " ");
            }
            else
            {
                i++;
            }
        }
        System.out.println(sb);
    }
}
