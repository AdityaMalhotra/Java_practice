import java.util.HashMap;

public class TimeInWords
{
    public static void main(String[] args) {
        System.out.println(timeInWords(1,1));
    }
    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
        String result = "";
        HashMap<Integer,String> tens = new HashMap<>();
        HashMap<Integer,String> numbers = new HashMap<>();

        tens.put(10,"ten");
        tens.put(20,"twenty");
        tens.put(30,"thirty");
        tens.put(40,"forty");
        tens.put(50,"fifty");
        tens.put(60,"sixty");

        numbers.put(1,"one");
        numbers.put(2,"two");
        numbers.put(3,"three");
        numbers.put(4,"four");
        numbers.put(5,"five");
        numbers.put(6,"six");
        numbers.put(7,"seven");
        numbers.put(8,"eight");
        numbers.put(9,"nine");
        numbers.put(10,"ten");
        numbers.put(11,"eleven");
        numbers.put(12,"twelve");
        numbers.put(13,"thirteen");
        numbers.put(14,"fourteen");
        numbers.put(15,"quarter");
        numbers.put(30,"half");
        numbers.put(16,"sixteen");
        numbers.put(17,"seventeen");
        numbers.put(18,"eighteen");
        numbers.put(19,"nineteen");

        if(m ==0) {
            result = numbers.get(h) + " o' clock";
            return result;
        }
        else if(m<=30 && m>0)
        {
            if(m==15 || m==30)
                result = numbers.get(m) + " past " + numbers.get(h);
            else
            {
                if(m>19)
                {
                    int remainder = m%10;
                    if(remainder != 0)
                    {
                        result = tens.get(m-remainder) + " " + numbers.get(remainder) + " minutes past " + numbers.get(h);
                    }
                    else
                    {
                        result = tens.get(m) + " minutes past " + numbers.get(h);
                    }
                }
                else
                {
                    if(m==1)
                    {
                        result = numbers.get(m) + " minute past " + numbers.get(h);
                    }
                    else {
                        result = numbers.get(m) + " minutes past " + numbers.get(h);
                    }
                }
            }
            return result;
        }
        else
        {
            int remainder = (60-m)%10;

            if(60-m == 15)
            {
                result = numbers.get(60-m) + " to " + numbers.get(h+1);
            }
            else if(60-m>19) {
                if (remainder != 0) {
                    result = tens.get((60 - m) - remainder) + " " + numbers.get(remainder) + " minutes to " + numbers.get(h + 1);
                } else {
                    result = tens.get(60 - m) + " minutes to " + numbers.get(h + 1);
                }
            }
            else
            {
                result = numbers.get(60-m) + " minutes to " + numbers.get(h+1);
            }
            return result;
        }
    }
}
