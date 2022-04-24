import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInSpecificOrder
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int n = Integer.parseInt(br.readLine());
            String[] inputArr = br.readLine().trim().split("\\s+");
            int[] arr = new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j] = Integer.parseInt(inputArr[j]);
            }

            int[] result = sort(arr);

            StringBuffer sb = new StringBuffer();
            for(int element : result)
                sb.append(element + " ");

            System.out.println(sb);
        }
    }
    public static int[] sort(int[] arr)
    {
        int[] result = new int[arr.length];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i : arr)
            if(i%2!=0)
                left.add(i);
            else
                right.add(i);

        Collections.sort(left,Collections.reverseOrder());
        Collections.sort(right);

        int j = 0;
        for(Integer i : left)
            result[j++] = i;
        for(Integer i : right)
            result[j++] = i;

        return result;
    }
}
