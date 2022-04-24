package RopeConnect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ropes = br.readLine().trim().split("\\s+");
        Arrays.sort(ropes);
        int smallestRope = Integer.parseInt(ropes[0]);
        int sum = 0;

        for (int i = 1; i < ropes.length; i++)
        {
            smallestRope+=Integer.parseInt(ropes[i]);
            sum+=smallestRope;
        }
        System.out.println(sum);
    }
}
