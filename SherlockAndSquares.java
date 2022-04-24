public class SherlockAndSquares
{
    public static void main(String[] args) {
        System.out.println(squares(17,24));
    }
    // Complete the squares function below.
    static int squares(int a, int b) {
        int count = 0;
        int i = a;
        while(i<=b)
        {
            int root = (int)Math.floor(Math.sqrt(i));
            if(root*root == i)
            {
                count++;
                i=i+root*2;
            }
            i++;
        }
        return count;
    }
}
