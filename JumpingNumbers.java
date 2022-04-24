import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbers
{
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(br.readLine().trim());
//        StringBuffer sb = new StringBuffer();
//        while(t-- > 0)
//        {
//            long x = Integer.parseInt(br.readLine().trim());
//            for(long i=0;i<=x;i++)
//            {
//                boolean flag = true;
//                int prevDigit = -1;
//                long temp = i;
//                while(temp>0)
//                {
//                    int digit = (int)temp%10;
//                    temp=temp/10;
//                    if(prevDigit!=-1 && Math.abs(digit-prevDigit) != 1)
//                    {
//                        flag = false;
//                        break;
//                    }
//                    prevDigit = digit;
//                }
//                if(flag)
//                   sb.append(i + " ");
//            }
//            sb.append("\n");
//        }
//        System.out.println(sb);
//    }
public static void main (String[] args)throws IOException
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t=Integer.parseInt(br.readLine());
    StringBuffer sb = new StringBuffer();
    while(t-->0)
    {
        int n=Integer.parseInt(br.readLine());
        Queue<Integer> q=new LinkedList<>();
        if(n<=10)
        {
            for(int i=0;i<=n;i++)
            {
                q.add(i);
            }
            while(!q.isEmpty())
            {
                sb.append(q.remove()+" ");
            }
        }
        else
        {
            for(int i=0;i<10;i++)
                q.add(i);

            int  x=0,i=1;
            sb.append(q.remove()+" ");

            while(!q.isEmpty())
            {
                int c=q.remove();
                int k=c%10;
                sb.append(c+" ");
                i++;

                if(c%10!=0)
                {
                    x=(c*10)+(k-1);
                    if(x<n )
                        q.add(x);
                }

                if(k<9)
                {
                    x=(c*10)+(k+1);
                    if(x<n)q.add(x);
                }
            }

        }
        sb.append("\n");
    }
    System.out.println(sb);
}

}
