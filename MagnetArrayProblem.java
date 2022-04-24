import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MagnetArrayProblem
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        DecimalFormat decimalFormat = new DecimalFormat(".##");
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] inputLine = br.readLine().trim().split("\\s+");

            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = Integer.parseInt(inputLine[i]);


            StringBuffer sb = new StringBuffer();

            for(int i=1;i<n;i++) {
                decimalFormat.format(binSearch(arr[i-1],arr[i],arr[i],arr));
                sb.append(String.format("%.2f", Double.valueOf(decimalFormat.format(binSearch(arr[i-1],arr[i],arr[i],arr)))) + " ");
            }

            System.out.println(sb);

        }
    }
    public static double binSearch(double l, double r, double n,int[] arr)
    {
        double mid;
        while(r>l)
        {
            mid = r+ (l-r)*0.50;
            double val = calcDistance(mid,arr);

            if(Math.abs(val)< 0.0000000000001)
                return mid;

            if(val>0)
                l = mid;
            else
                r = mid;
        }
        return l;
    }
    public static double calcDistance(double mid,int[] arr)
    {
        double ans = 0;

        for(int i=0;i<arr.length;i++)
        {
            ans +=1/(mid-arr[i]);
        }

        return ans;
    }
}
