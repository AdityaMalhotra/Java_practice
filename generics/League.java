package generics;

import java.util.ArrayList;
import java.util.List;

public class League<T extends Team>
{
    private String name;

    private List<T> teamList = new ArrayList<>();

    public boolean addTeam(T team)
    {
        if(this.teamList.contains(team))
            return false;
        else
        {
            teamList.add(team);
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
