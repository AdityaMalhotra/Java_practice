package ActivitySelection;

public class Activity implements Comparable<Activity>
{
    public int startTime;
    public int finishTime;

    public Activity(int startTime,int finishTime)
    {
        this.startTime = startTime;
        this.finishTime = finishTime;
    }

    public int compareTo(Activity that)
    {
        if(this.finishTime<that.finishTime)
            return -1;
        else if (this.finishTime == that.finishTime)
            return 0;
        else
            return 1;
    }
}
