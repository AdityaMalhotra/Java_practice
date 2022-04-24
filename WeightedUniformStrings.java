import java.util.Arrays;
import java.util.List;
//See hackerrank for suubmission
//Not the correct one here
public class WeightedUniformStrings
{
    public static void main(String[] args) {
        String s = "abccddde";
        Integer[] queries = {1,3,12,5,9,10};
        System.out.println(Arrays.toString(weightedUniformStrings(s,queries)));
    }
//    static String[] weightedUniformStrings(String s, int[] queries)
//    {
//        Boolean weight[] = new Boolean[queries.length];
//        for(int i = 0;i<s.length();i++)
//        {
//            int sum = 0;
//            int j;
//            for(j = 0;j<s.length() - i && s[i] == s[i+j];j++)
//            {
//                sum += s[i+j]-'a' + 1;
//                weight[sum] = true;
//            }
//
//        }
//    }
    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, Integer[] queries)
    {
        String[] answers = new String[queries.length];
        Arrays.fill(answers,"No");
        List<Integer> queryList = Arrays.asList(queries);
        int count;
        int i = 0;
        while(i<s.length())
        {
            int weight = s.charAt(i) - 'a' + 1;
            if(queryList.contains(weight))
            {
                answers[queryList.indexOf(weight)] = "Yes";
            }
            count = 1;
            if(i+1<s.length())
            {
                while (i+1<s.length() && s.charAt(i + 1) == s.charAt(i))
                {
                    count++;
                    if(queryList.contains(weight))
                    {
                        answers[queryList.indexOf(weight)] = "Yes";
                    }
                    i++;
                }
            }
            i++;
        }
    //    System.out.println(Arrays.toString(weightList.toArray()));


        return answers;
    }

}
