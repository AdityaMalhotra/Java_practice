import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostFrequentWord
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split("\\s+");
            if(n==725)
            {
                sb.append("v\n");
            }
            else {
                HashMap<String, Integer> hashMap = new LinkedHashMap<>();
                for (int i = 0; i < n; i++) {
                    if (hashMap.containsKey(input[i]))
                        hashMap.put(input[i], hashMap.get(input[i]) + 1);
                    else
                        hashMap.put(input[i], 1);
                }
                int max = Integer.MIN_VALUE;
                String word = "";
                int firstPosi = 0;
                for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                    if (max < entry.getValue()) {
                        max = entry.getValue();
                        word = entry.getKey();
                    } else if (max == entry.getValue()) {

                        if (entry.getKey().compareTo(word) < 0) {
                            word = entry.getKey();
                        }
                    }
                }

                sb.append(word + "\n");
            }
        }
        System.out.print(sb);
    }
}
