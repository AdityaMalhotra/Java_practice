public class RepeatedString
{
    public static void main(String[] args) {
        System.out.println(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",549382313570L));
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s,long n){
        long repetitions = n/s.length();
        System.out.println("repetitions " + repetitions);
        long extras = n%s.length();
        System.out.println("extras " + extras);
        long count = 0;
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c == 'a')
            {
                count++;
            }
        }
        count=count*repetitions;
        if(extras>=0) {
            for (int i = 0; i < extras; i++) {
                char c = s.charAt(i);
                if (c == 'a') {
                    count++;
                }
            }
        }
        return count;
    }
}
