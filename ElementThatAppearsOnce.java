import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ElementThatAppearsOnce
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split("\\s+");
            if(n==1)
            {
                sb.append(input[n] + "\n");
            }
            else {
                Arrays.sort(input);
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    int num = Integer.parseInt(input[i]);
                    if (i + 1 < n && i - 1 >= 0) {
                        int nextNum = Integer.parseInt(input[i + 1]);
                        int prevNum = Integer.parseInt(input[i - 1]);
                        if (num != nextNum && num != prevNum) {
                            sb.append(num + "\n");
                            break;
                        }
                    } else if (i - 1 < 0) {
                        int nextNum = Integer.parseInt(input[i + 1]);
                        if (num != nextNum) {
                            sb.append(num + "\n");
                            break;
                        }
                    } else if (i + 1 >= n) {
                        int prevNum = Integer.parseInt(input[i - 1]);
                        if (num != prevNum) {
                            sb.append(num + "\n");
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
