public class GameOfStones
{
    public static void main(String[] args) {

    }
    // Complete the gameOfStones function below.
    static String gameOfStones(int n) {
        return n%7==0 || n%7==1? "Second" : "First";
    }
}
