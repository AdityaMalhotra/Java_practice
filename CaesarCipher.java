public class CaesarCipher
{
    public static void main(String[] args) {
        System.out.println(caesarCipher("Hello_World!",4));
    }
    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        char[] arr = s.toCharArray();
        String encryptedString = "";
        int remainder = k%26;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i] >= 'a' && arr[i] <='z') || (arr[i] >= 'A' && arr[i]<='Z'))
            {
                if((arr[i] >='a' && arr[i]<='z') && ((int)arr[i] + remainder > (int)'z'))
                {
                    int difference =(int)'z' - (int)arr[i];
                    int extraNums = remainder-difference;
                    encryptedString += (char) ((int) 'a' + extraNums - 1);
                }
                else if(arr[i] >= 'A' && arr[i]<='Z' && ((int)arr[i] + remainder > (int)'Z'))
                {
                    int difference =(int)'Z' - (int)arr[i];
                    int extraNums = remainder-difference;
                    encryptedString += (char) ((int) 'A' + extraNums - 1);
                }
                else
                {
                    char newChar = (char)((int)arr[i] + remainder);
                    encryptedString+=newChar;
                }
            }
            else
            {
                encryptedString+=arr[i];
            }
        }
        return encryptedString;

    }
}
