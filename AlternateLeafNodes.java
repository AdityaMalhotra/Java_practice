import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlternateLeafNodes
{
    static class BST
    {
        public Integer data;
        public BST left;
        public BST right;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuffer sb = new StringBuffer();
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String input[] = br.readLine().trim().split("\\s+");
            BST root = new BST();
            root.data = Integer.parseInt(input[0]);
            for(int i=1;i<n;i++)
            {
                if(i<root.data)
                {
                    BST bst = new BST();
            //        root.left = n
                }
            }
//            int[] arr = new int[n];
//            for(int i=0;i<n;i++)
//                arr[i] = Integer.parseInt(input[i]);



//            List<Integer> leafList = new ArrayList<>();
//            int root = arr[0];
//            for(int i=0;i<n;i++)
//            {
//                if(arr[i] > root && i!=1)
//                {
//                    leafList.add(arr[i-1]);
//                }
//
//            }
//            long sum = 0;
//            for(int i=0;i<leafList.size();i+=2)
//            {
//                sum+=leafList.get(i);
//            }
//            sb.append(sum + "\n");
        }
        System.out.println(sb);
    }
}
