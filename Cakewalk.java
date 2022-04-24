import java.util.Arrays;

public class Cakewalk
{
    public static void main(String[] args) {
        int calorie[] = {1,3,2};
        System.out.println(marcsCakewalk(calorie));
    }
    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);
        long result = 0;
        for(int i=calorie.length-1;i>=0;i--)
        {
            result+=Math.pow(2,i) * calorie[calorie.length-1 - i];
        }
        return result;
    }
}
