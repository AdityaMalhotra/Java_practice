public class BeautifulBinaryString
{
    public static void main(String[] args) {
        System.out.println(beautifulBinaryString("011"));
    }

    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {
        int count = 0;
        int i = 0;
        while(i<b.length()-2)
        {
            if(b.charAt(i)=='0')
            {
                if(b.charAt(i+1) == '1')
                {
                    if(b.charAt(i+2) == '0')
                    {
                        count++;
                        i+=3;
                        continue;
                    }
                    else {
                        i += 2;
                        continue;
                    }
                }
                else {
                    i += 1;
                    continue;
                }
            }
            i++;
        }
        return count;
    }
}
