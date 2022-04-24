import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MadScientist
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split("#");
        int infectedWeight = Integer.parseInt(strArr[0]);
        String[] weights = strArr[1].split(",");
        int[] arr = new int[weights.length];
        for(int i = 0;i<weights.length;i++)
        {
            arr[i] = Integer.parseInt(weights[i]);
        }
        Arrays.sort(arr);

        int i = 0;
        int removalsNeeded = arr.length;
        int moves = 0;
        int best = removalsNeeded;

        while(i<arr.length) {
            if (infectedWeight > arr[i]) {
                infectedWeight += arr[i];
                removalsNeeded--;
                i = i + 1;
            } else {
                infectedWeight = infectedWeight + (infectedWeight - 1);
                moves++;
            }
            best = Math.min(best,moves + removalsNeeded);
        }
        System.out.println(best);
    }
}
