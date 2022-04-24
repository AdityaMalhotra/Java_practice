import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumOfSubarrays
{
    public static class BinarySearchComparator implements Comparator<Long>
    {
        @Override
        public int compare(Long o1, Long o2)
        {
            if(o1.equals(o2))
                return 0;
            else if(o1 < o2)
                return 1;
            else
                return -1;
        }
    }
    static BinarySearchComparator comparator = new BinarySearchComparator();
    public static void main(String[] args)throws IOException
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0)
        {
            PriorityQueue<Long> Q = new PriorityQueue<>(comparator);
            int n = s.nextInt();
            int k = s.nextInt();
            long []arr = new long[n];
            for(int i = 0 ; i < n ; i++)
                arr[i] = s.nextLong();
            for(int i = 0 ; i < n-k+1 ; i++)
            {
                for(int j = i ; j < i+k ; j++)
                    Q.add(arr[j]);
                System.out.print(Q.peek()+" ");
                Q.clear();
            }
            System.out.println();
        }
        s.close();
    }
//    public static void main(String[] args) throws IOException {
//        BinarySearchComparator comparator = new BinarySearchComparator();
//        PriorityQueue<Long> Q = new PriorityQueue<>(comparator);
//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        while(t-- > 0)
//        {
//            int n = s.nextInt();
//            int k = s.nextInt();
//
//            Long arr[] = new Long[n];
//            for(int j=0;j<n;j++)
//                arr[j] =  s.nextLong();
//            StringBuffer sb = new StringBuffer();
//            Q.clear();
//            for(int i = 0;i<n-k+1;i++)
//            {
//                for(int j=i;j<i+k;j++)
//                {
//                    Q.add(arr[j]);
//                }
//                sb.append(Q.peek() + " ");
//                Q.clear();
//            }
//
//            System.out.println(sb);
//        }
//        s.close();
//    }
//    public static String findMaxinSubArrays(Long[] arr, int k)
//    {
//        String result = "";
//        int left = 0;
//        int right = 0+k;
//        while(right<=arr.length)
//        {
//            int max = arr[left];
//            for(int i = left;i<right;i++)
//            {
//                if(max<arr[i])
//                    max = arr[i];
//            }
//            result+=max + " ";
//            left++;
//            right++;
//        }
//
//        return result.trim();
//    }

}
