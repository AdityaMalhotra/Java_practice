package ActivitySelection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start[] = br.readLine().trim().split("\\s+");
        String finish[] = br.readLine().trim().split("\\s+");

        ArrayList<Activity> actList = new ArrayList<Activity>();
        for(int i=0;i<start.length;i++)
        {
            actList.add(new Activity(Integer.parseInt(start[i]),Integer.parseInt(finish[i])));
        }
        Collections.sort(actList);
        StringBuffer sb = new StringBuffer();
        Activity prevAct = actList.get(0);
        sb.append(0 + " ");

        for(Activity act : actList)
        {
            if(act.startTime >= prevAct.finishTime)
            {
                prevAct = act;
                sb.append(actList.indexOf(prevAct) + " ");
            }
        }
        System.out.println(sb);
    }
}
