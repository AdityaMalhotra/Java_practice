public class TaumBday
{
    public static void main(String[] args) {
        System.out.println(taumBday(27984,1402,619246 ,615589 ,247954));
    }
    // Complete the taumBday function below.
    static int taumBday(int b, int w, int bc, int wc, int z) {
        if(bc == wc)
        {
            return (b*bc + w*wc);
        }
        else
        {
            if(bc > wc + z)
            {
                return b*(wc + z) + w*(wc);
            }
            else if (wc>bc + z)
            {
                return w*(bc+z) + b*(bc);
            }
            else
            {
                return b*bc + w * wc;
            }
        }
    }
}
