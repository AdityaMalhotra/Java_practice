import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            Integer n = Integer.parseInt(br.readLine());
            String arrayString = br.readLine();
            String[] strArray = arrayString.trim().split("\\s+");
            int[] arr = new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]  = Integer.parseInt(strArray[j]);
            }
            findLeaders(n,arr);
        }
    }
    public static void findLeaders(int n, int[] arr)
    {
        StringBuffer sb = new StringBuffer();
        List<Integer> list = new ArrayList<>();
        int leader = arr[n-1];
        list.add(leader);

        for(int i = n-2;i>=0;i--) {
            if(arr[i]>=leader) {
                leader = arr[i];
                list.add(leader);
            }
        }
        for(int i = list.size()-1;i>=0;i--)
        {
            sb.append(list.get(i) + " ");
        }
        System.out.println(sb);
    }
}
