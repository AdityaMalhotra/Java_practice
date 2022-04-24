import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance
{
    public static void main(String[] args) {
        int[][] contests = {{5,1},{2,1},{1,1},{8,1},{10,0},{5,0}};
        System.out.println(luckBalance(3,contests));
    }
    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int maxLuck = 0;
        List<Integer> importantContestsLuck = new ArrayList<>();
        for(int i = 0;i<contests.length;i++)
        {
            if(contests[i][1] == 1)
            {
                importantContestsLuck.add(contests[i][0]);
            }
            maxLuck+=contests[i][0];
        }
        Collections.sort(importantContestsLuck);
        for(Integer i: importantContestsLuck)
        {
            if(importantContestsLuck.size()-k<=0)
            {
                break;
            }
            maxLuck-=i*2;
            k++;
        }
        return maxLuck;
    }
}
