import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class PrimeSum
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            if(n>1) {
                HashMap<Integer, Boolean> hashMap = new HashMap<>();
                hashMap.put(2, true);

                long sum = 2;
                for (int i = 2; i <= n; i++) {
                    boolean flag = true;
                    for (Integer keys : hashMap.keySet()) {
                        if (i % keys == 0) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        System.out.println("Prime : " + i);
                        hashMap.put(i, true);
                        sum += i;
                    }
                }
                System.out.println(sum);
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}
