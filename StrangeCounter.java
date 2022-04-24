public class StrangeCounter
{
    public static void main(String[] args) {
        System.out.println(strangeCounter(21));
    }
    // Complete the strangeCounter function below.
    static long strangeCounter(long t) {
//        int timeElapsed = 1;
//        int counter = 3;
//        int prevCounter = counter;
//        while(timeElapsed<t)
//        {
//            timeElapsed++;
//            counter--;
//            if(counter<1)
//            {
//                counter = 2*prevCounter;
//                prevCounter = counter;
//            }
//        }
//        return counter;

        long rem = 3;
        while(t>rem)
        {
            t = t-rem;
            rem*=2;
        }
        return (rem-t+1);
    }
}
