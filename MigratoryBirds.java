import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds
{
    public static void main(String[] args) {
        List input = new ArrayList<Integer>();
        input.add(1);
        input.add(4);
        input.add(4);
        input.add(4);
        input.add(5);
        input.add(3);
        System.out.println(migratoryBirds(input));
    }
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int count[] = new int[5];
        for(int i:arr)
        {
            count[i-1]++;
        }
        int birdHavingMaxCount = 1;
        int max_count = count[0];
        for(int i=0;i<5;i++)
        {
            if(count[i] > max_count)
            {
                max_count = count[i];
                birdHavingMaxCount = i+1;
            }
        }
        return birdHavingMaxCount;
    }
}
