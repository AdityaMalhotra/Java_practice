import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SantaAndChildren
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1[] = br.readLine().trim().split("\\s+");
        String line2[] = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);

        int[] arr = new int[n];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(line2[i]);
            if(arr[i]!=0) {
                hm.put(i + 1, arr[i] / m);
            }
        }
        int maxVal = 0;
        int result = 0;
        for(Map.Entry<Integer,Integer> map : hm.entrySet())
        {
            if(map.getValue()>maxVal)
            {
                maxVal = map.getValue();
                result = map.getKey();
            }
            else if(map.getValue() == maxVal)
            {
                result = map.getKey();
            }
        }
        System.out.println(result);
    }
}
