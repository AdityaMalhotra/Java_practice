public class MaximizingXOR
{
    public static void main(String[] args) {
        System.out.println(maximizingXor(10,15));
    }
    // Complete the maximizingXor function below.
    static int maximizingXor(int l, int r) {
        int xored = l ^ r;
        int significantBit = 31 - Integer.numberOfLeadingZeros(xored);
        int result = (1<<(significantBit+1)) - 1;
        return result;
    }
}
