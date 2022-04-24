import java.util.Arrays;

public class FlatlandSpaceStation
{
    public static void main(String[] args) {
        int c[] = {13,1,11,10,6};
        System.out.println(flatlandSpaceStations(20,c));
    }
    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int a[] = new int[n];
        Arrays.fill(a,Integer.MAX_VALUE);
        for(int i=0; i<c.length; i++){
            int x = c[i];
            for(int j=0; j<n; j++){
                if(j==x)
                    a[j]=0;
                else if(a[j]>Math.abs(j-x))
                    a[j] = Math.abs(j-x);
            }
        }
        Arrays.sort(a);
        return a[n-1];
    }
}
