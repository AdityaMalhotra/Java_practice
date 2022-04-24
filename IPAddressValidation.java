public class IPAddressValidation
{
    public boolean isValidIP(String s)
    {
        int countDots = 0;

        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='.')
                countDots++;

        if(countDots>3)
            return false;
        String nums[] = s.trim().split("\\.");

        if(nums.length!=4)
            return false;

        for(String num : nums)
        {
            if(!check(num))
                return false;
        }
        return true;
    }
    public boolean check(String s)
    {
        if(s.startsWith("0") && s.length()>1)
            return false;

        if(s.length()==0 || s.length()>3)
            return false;
        try {
            int num = Integer.parseInt(s);
            if(0<=num && num<=255)
                return true;
            else
                return false;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
}
