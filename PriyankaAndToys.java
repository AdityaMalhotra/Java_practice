import java.util.Arrays;

public class PriyankaAndToys
{
    public static void main(String[] args) {
        int w[] = {1,2,3,21,7,12,14,21};
        System.out.println(toys(w));
    }
    // Complete the toys function below.
    static int toys(int[] w) {
        Arrays.sort(w);
        int containers = 1;
        int minimumElement = w[0];
        for(int i=0;i<w.length;i++)
        {
            if(w[i]>minimumElement+4)
            {
                minimumElement = w[i];
                containers++;
            }
        }
        return containers;
    }
}
