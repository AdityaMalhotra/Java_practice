import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FloorInSortedArray
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String[] inputLine1 = br.readLine().trim().split("\\s+");
            String[] inputLine2 = br.readLine().trim().split("\\s+");

            int n = Integer.parseInt(inputLine1[0]);
            int x = Integer.parseInt(inputLine1[1]);

            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = Integer.parseInt(inputLine2[i]);
            }

            int result = binSearch(arr,n,x);

            System.out.println(result);
        }
    }
    public static int binSearch(int[] arr,int n,int x)
    {
        if(arr[0]>x)
            return -1;
        if(arr[n-1]<x)
            return n-1;
        int left = 0;
        int right = n-1;
        int mid = 0;
        while(left<=right)
        {
            mid = (int)Math.ceil((left+right)/2);
            if(arr[mid] == x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return left-1;
    }
}
