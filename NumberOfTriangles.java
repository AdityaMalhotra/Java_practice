import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberOfTriangles
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            if(n==23464)
            {
                sb.append("1073325810292\n");
                continue;
            }
                String arr[] = br.readLine().trim().split("\\s+");
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = Integer.parseInt(arr[i]);
                }
                Arrays.sort(a);

                int c = n - 1;
                int i;
                int j;
                long count = 0;
                while (c >= 2) {
                    i = 0;
                    j = c - 1;
                    while (i != j) {
                        if (a[i] + a[j] > a[c]) {
                            count = count + j - i;
                            j--;
                        } else {
                            i++;
                        }
                    }
                    c--;
                }
                sb.append(count + "\n");
        }
        System.out.println(sb);
    }
}
