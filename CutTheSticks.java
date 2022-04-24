import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,3,2,1};
        System.out.println(Arrays.toString(cutTheSticks(arr)));
    }

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> outputList = new ArrayList<Integer>();
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i = 0; i<arr.length;i++)
        {
            tempList.add(arr[i]);
        }
        while(true)
        {
            if(tempList.size() == 0)
            {
                break;
            }
            outputList.add(tempList.size());
            int min = Integer.MAX_VALUE;
            int i = 0;
            while(i<tempList.size())
            {
                if(tempList.get(i)<min)
                {
                    min = tempList.get(i);
                }
                i++;
            }
            System.out.println("Remaining items : " + tempList.size());
            int j = 0;
            List temp2 = new ArrayList<Integer>();
            temp2.add(min);
            tempList.removeAll(temp2);
            while(j<tempList.size())
            {
                    tempList.set(j,tempList.get(j)-min);
                    j++;
            }
        }
        int[] output = new int[outputList.size()];
        for(int i = 0;i<outputList.size();i++)
        {
            output[i] = outputList.get(i);
        }
        return output;
    }
}
