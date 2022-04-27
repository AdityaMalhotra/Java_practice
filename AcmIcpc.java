import java.util.Arrays;

public class AcmIcpc
{
    public static void main(String[] args) {
        String[] topic = {"10101","11100","11010","00101"};
        System.out.println(Arrays.toString(acmTeam(topic)));
    }
    /*
        O(n^2) solution to https://www.hackerrank.com/challenges/acm-icpc-team/problem
     */
    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {
        int countOfTeams = 0;
        int maxTopics = 0;
        for(int i=0;i<topic.length;i++)
        {
            for(int j=i+1;j<topic.length;j++)
            {
                int topics = 0;
                char[] first = topic[i].toCharArray();
                char[] second = topic[j].toCharArray();
                for(int k = 0; k< first.length;k++)
                {
                    if(first[k] == '1' || second[k] == '1')
                    {
                        topics++;
                    }
                }
                if(maxTopics<topics)
                {
                    maxTopics = topics;
                    countOfTeams = 1;
                }
                else if(maxTopics == topics)
                {
                    countOfTeams++;
                }
            }
        }
        int[] result = {maxTopics,countOfTeams};
        return result;
    }
}
