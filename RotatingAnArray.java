import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotatingAnArray
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            int n = Integer.parseInt(br.readLine());
            String arrayLine = br.readLine();
            String[] elements = arrayLine.trim().split("\\s+");
            int arr[] = new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j] = Integer.parseInt(elements[j]);
            }
            int d = Integer.parseInt(br.readLine());
            rotateArray(arr,d);
            StringBuffer sb = new StringBuffer();
            for(int k : arr)
            {
                sb.append(k + " ");
            }
            System.out.println(sb);
        }
    }
    public static int[] rotateArray(int[] arr, int d)
    {
        int[] rotatedElements = new int[d];

        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i+1<=d)
            {
                rotatedElements[i] = arr[i];
            }
            else if(i<arr.length)
            {
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=0;i<d;i++)
        {
            arr[j] = rotatedElements[i];
            j++;
        }
        return arr;
    }
}
