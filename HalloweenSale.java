public class HalloweenSale
{
    public static void main(String[] args) {
        System.out.println(howManyGames(16 ,2 ,1, 9981));
    }
    // Complete the howManyGames function below.
    static int howManyGames(int p, int d, int m, int s) {
        int noOfGames = 0;
        while(s>=p)
        {
            s=s-p;
            noOfGames++;
            p = Math.max(p-d,m);
        }
        return noOfGames;
    }
}
