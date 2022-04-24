import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PairingTheBrackets
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            String str = br.readLine().trim();
            List<String> stringList = new ArrayList<>();
            int count = 0;
            int i=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)==')')
                {
                    while(i<j) {
                        if (str.charAt(i) == '(') {
                            count++;
                            stringList.add(i + " " + j + "\n");
                            i++;
                            break;
                        }
                        i++;
                    }
                }
            }
            StringBuffer sb = new StringBuffer();
            sb.append(count + "\n");
            for(String s : stringList)
                sb.append(s);

            System.out.print(sb);
        }
    }
}
