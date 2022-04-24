public class FairRations
{
    public static void main(String[] args) {
        int[] B = {2,3,4,5,6};
        fairRations(B);
    }

    // Complete the fairRations function below.
    static int fairRations(int[] B) {
        int breadGiven = 0;
        int sum = 0;
        int i = 0;
        while(i<B.length)
        {
            sum+=B[i];
            i=i+1;
        }
        if(sum%2!=0) {
            System.out.println("NO");
            System.exit(0);
    }
        else
        {
            for(int j=0;j<B.length;j++)
            {
                if(B[j]%2!=0)
                {
                    B[j]=B[j]+1;
                    B[j+1] = B[j+1] + 1;
                    breadGiven+=2;
                }
            }
            return breadGiven;
        }
        return 0;
    }
}
