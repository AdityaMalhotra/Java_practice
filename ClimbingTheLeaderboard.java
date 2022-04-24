import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class ClimbingTheLeaderboard
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] scoreStr = br.readLine().trim().split("\\s+");
        int m = Integer.parseInt(br.readLine());
        String[] aliceString = br.readLine().trim().split("\\s+");

        int scores[] = new int[n];

        for(int i=0;i<n;i++)
            scores[i] = Integer.parseInt(scoreStr[i]);

        int alice[] = new int[m];

        for(int i=0;i<m;i++)
            alice[i] = Integer.parseInt(aliceString[i]);

        int[] result = climbingLeaderboard(scores,alice);

        StringBuffer sb = new StringBuffer();
        for(int i : result)
            sb.append(i + "\n");

        System.out.println(sb);
    }
    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];
        Arrays.fill(result,0);
        HashMap<Integer,Integer> rankmap = new HashMap<>();
        int prevScore = scores[0];
        rankmap.put(prevScore,1);
        for(int i = 1;i<scores.length;i++)
        {
            if(scores[i] != prevScore)
            {
                rankmap.put(scores[i],rankmap.get(scores[i-1]) + 1);
                prevScore = scores[i];
            }
        }
        int j = 0;
        int i = scores.length-1;
        while(i>=0)
        {
            if(rankmap.containsKey(alice[j]))
            {
                result[j] = rankmap.get(alice[j]);
                j++;
            }
            else if (alice[j] < scores[i])
            {
                int rank = rankmap.get(scores[i]) + 1;
                result[j] = rank;
                rankmap.put(alice[j],rank);
                j++;
                i--;
            }
            else if (alice[j]>scores[i])
            {
                i--;
            }
        }
        j = result.length-1;
        while(result[j]==0)
        {
            result[j] = 1;
            j--;
        }

        return result;
    }
}
