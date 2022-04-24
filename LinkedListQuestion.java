import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class LinkedListQuestion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] input = br.readLine().trim().split("\\s+");

            List<Double> list = new LinkedList<Double>();
            for(int i=0;i<n;i++)
            {
                ((LinkedList<Double>) list).addLast(Double.parseDouble(input[i]));
            }
            int i=1;
            while(i<n-1)
            {
                if(list.get(i) == list.get(i-1))
                {
                    if(list.get(i+1)==100)
                    {
                        list.add(i-1,(double)100);
                        list.add(i,list.get(i) + list.get(i)*0.1);
                    }
                }
                i++;
            }
            i=0;
            while(i<n)
            {
                if(list.get(i) == 100)
                {
                    Double item = list.get(i);
                    list.add(i,(double)-1);
                    ((LinkedList<Double>) list).addLast(item);
                }
                if(list.get(i)!=-1)
                {
                    sb.append(list.get(i) + "-> ");
                }
                i++;
            }
            for(int j=n;j<list.size()-1;j++)
            {
                sb.append(list.get(j) + "-> ");
            }
            sb.append(list.get(list.size()-1) + "\n");
        }
        System.out.println(sb);
    }
}
