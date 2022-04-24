import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularArrayRotation
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inputs[] = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inputs[0]);
            int k = Integer.parseInt(inputs[1]);
            int q = Integer.parseInt(inputs[2]);

            String arrayLine = br.readLine();
            String[] elements = arrayLine.trim().split("\\s+");
            int arr[] = new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j] = Integer.parseInt(elements[j]);

            }
            int queries[] = new int[q];

            for(int j =0;j<q;j++) {
                queries[j] = Integer.parseInt(br.readLine());
                System.out.println("Input");
            }
            int d = Integer.parseInt(br.readLine());
            int result[] = circularArrayRotation(arr,k,queries);
            StringBuffer sb = new StringBuffer();
            for(int i : result)
            {
                sb.append(i + "\n");
            }
            System.out.println(sb);
    }
    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] rotatedElements = new int[k];

        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(i+1<=k)
            {
                rotatedElements[i] = a[i];
            }
            else if(i<a.length)
            {
                a[j] = a[i];
                j++;
            }
        }
        for(int i=0;i<k;i++)
        {
            a[j] = rotatedElements[i];
            j++;
        }
        int[] result =new  int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            result[i] = a[queries[i]];
        }
        return result;
    }
}
