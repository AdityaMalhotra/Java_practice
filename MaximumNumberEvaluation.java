import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaximumNumberEvaluation
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String str[] = br.readLine().trim().split("\\s+");
            List<Integer> list = new ArrayList<>();
            for(String s : str)
            {
                if(s.equals("?"))
                    list.add(-1);
                else
                    list.add(Integer.parseInt(s));
            }
            int i=0;
            while(i<list.size()-2) {
                if (list.get(i + 2) == -1) {
                    Integer num1 = list.get(i);
                    Integer num2 = list.get(i + 1);
                    list.remove(i);
                    list.remove(i);
                    list.remove(i);
                    list.add(i, Math.max(num1 * num2, num1 + num2));
                    i-=2;
//                    for(int j=0;j<list.size();j++)
//                        System.out.print(list.get(j) + " ");
//                    System.out.println("I: " + i);
                }
                i++;
            }
//            for(Integer i1 : list)
//                System.out.println("List element : " + i1);
           System.out.println(list.get(0));
        }
    }
}
