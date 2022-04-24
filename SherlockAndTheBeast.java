public class SherlockAndTheBeast
{
    public static void main(String[] args) {
        decentNumber(11);
    }
    // Complete the decentNumber function below.
    static void decentNumber(int n) {
        int x = n;
        while(x%3!=0)
        {
            x-=5;
        }
        if(x<0)
            System.out.println(-1);
        else
            System.out.println((new String(new char[x]).replace("\0","5")) + (new String(new char[n-x]).replace("\0","3")));
    }
//        String resultString = "";
//        if(n>=3)
//        {
//            int i=0;
//            int j=0;
//            if(n%3 == 0)
//            {
//                for(int k = 0;k<n;k++)
//                {
//                    resultString+="5";
//                }
//            }
//            else {
//                while (i + j <= n) {
//                    j = n - i;
//                    System.out.println("J : " + j);
//                    if ((i + j == n) && (j % 5 == 0)) {
//                        resultString+= new String(new char[i]).replace("\0","5");
//                        resultString+=new String(new char[j]).replace("\0","3");
//                        break;
//                    }
//                    i = i + 3;
//                    j = 0;
//                }
//            }
//        }
//        if(resultString == "")
//            System.out.println(-1);
//        else
//            System.out.println(resultString);
//
//    }
}
