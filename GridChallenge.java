import java.util.Arrays;

public class GridChallenge
{
    public static void main(String[] args) {
        String[] grid = {"abc","lmp","qrt"};
        System.out.println(gridChallenge(grid));
    }
    // Complete the gridChallenge function below.
    static String gridChallenge(String[] grid) {
        int i=0;
        while(i<grid.length)
        {
            char[] charArr = grid[i].toCharArray();
            Arrays.sort(charArr);
            grid[i] = new String(charArr);
            i++;
        }
        for(i=0;i<grid.length-1;i++)
        {
            for(int j=0;j<grid[i].length();j++)
            {
                if(grid[i].charAt(j)>grid[i+1].charAt(j))
                {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
