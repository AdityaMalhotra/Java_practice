import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CountDistinctPairs
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        HashMap<Integer,Integer> hm = new HashMap<>();
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split("\\s+");
            int k = Integer.parseInt(br.readLine().trim());
            hm.clear();
            int arr[] = new int[n];
            int pairs = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
                int count;
                if (hm.containsKey(arr[i]))
                    count = hm.get(arr[i]) + 1;
                else
                    count = 1;

                hm.put(arr[i], count);
            }

            for (int i = 0; i < n; i++) {
                if (k == 0) {
                    if (hm.get(arr[i]) > 1) {
                        pairs++;
                        //    hm.put(arr[i],hm.get(arr[i])-1);
                    }
                }
                else {
                    if (hm.containsKey(arr[i] + k) && hm.get(arr[i] + k) > 0) {
                        pairs++;
                     //   hm.put(arr[i] + k, hm.get(arr[i] + k) - 1);
                    } else if (hm.containsKey(arr[i] - k) && arr[i] - k > 0 && hm.get(arr[i] - k) > 0) {
                        pairs++;
                    //    hm.put(arr[i] - k, hm.get(arr[i] - k) - 1);
                    }
                }
                hm.put(arr[i], 0);
            }
            sb.append(pairs + "\n");
        }
        System.out.print(sb);
    }
}
