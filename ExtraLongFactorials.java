import java.math.BigInteger;

public class ExtraLongFactorials
{
    public static void main(String[] args) {

    }
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger result = new BigInteger("1");
        for(int i=2;i<=n;i++)
            result=result.multiply(BigInteger.valueOf(i));

        System.out.println(result);
    }
}
