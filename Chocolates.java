public class Chocolates
{
    //REDO
    public static void main(String[] args) {
        System.out.println(chocolateFeast(6,2,2));
    }
    /*
        Solution to https://www.hackerrank.com/challenges/chocolate-feast/problem
     */
    // Complete the chocolateFeast function below.
    static int chocolateFeast(int n, int c, int m) {
        int chocolates = n/c;
        int wrappers = chocolates;
        while(wrappers/m>0)
        {
            chocolates = chocolates + wrappers/m;
            wrappers = wrappers%m + wrappers/m;
        }
        return chocolates;
    }
}
