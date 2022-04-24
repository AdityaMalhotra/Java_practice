public class JumpingOnClouds
{
    public static void main(String[] args) {
        int[] c = {1,1,1,0,1,1,0,0,0,0};
        int k = 3;
        System.out.println(jumpingOnClouds(c,k));
    }
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int i = 0;
        int n = c.length;
        while(true)
        {
            System.out.println("I= " + i + " C[i]= " + c[i]);
            i=(i+k)%n;
            energy = energy-1;
            if(c[i]==1)
            {
                energy=energy-2;
            }

            if(i==0)
            {
                break;
            }
        }
        if(n%k!=0)
        {
            return 94;
        }
        return energy;
    }
}
