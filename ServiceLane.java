public class ServiceLane
{
    public static void main(String[] args) {

    }
    // Complete the serviceLane function below.
    static int[] serviceLane(int n, int[][] cases) {
        int[] widths = new int[n];
        for(int i = 0; i<n;i++)
        {
            widths[i]= cases[0][i];
        }

        for(int j = 0; j<cases.length;j++)
        {
            for(int k = 0; k<cases[j].length;k++)
            {
                int min = 0;
//                for(int x = widths[cases[j][k]];x<widths[cases])
            }
        }
    return null;
    }
}

