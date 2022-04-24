import java.util.Arrays;
import java.util.HashMap;

public class Gemstones
{
    public static void main(String[] args) {
        String[] arr = {"abcdde","baccd","eeabg"};
        System.out.println(gemstones(arr));
    }
    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        HashMap<Character,Integer> counter = new HashMap<>();
        Boolean flag[] = new Boolean[26];
        for(int i=0;i<arr.length;i++)
        {
            Arrays.fill(flag,false);
            for(int j=0;j<arr[i].length();j++)
            {
                if(!flag[arr[i].charAt(j) - 'a']) {
                    if(counter.containsKey(arr[i].charAt(j))) {
                        counter.put(arr[i].charAt(j), counter.get(arr[i].charAt(j)) + 1);
                    }
                    else
                    {
                        counter.put(arr[i].charAt(j),1);
                    }
                    flag[arr[i].charAt(j) - 'a'] = true;
                }
            }
        }
        int result = 0;
        for(Integer k : counter.values())
        {
            if(k==arr.length)
            {
                result++;
            }
        }
        return result;
    }
}
