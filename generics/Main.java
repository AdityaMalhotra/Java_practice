package generics;

public class Main
{
    public static void main(String[] args) {
        SoccerTeam t1 = new SoccerTeam("ABC");
        BaseballTeam t2 = new BaseballTeam("CDE");
        SoccerTeam t3 = new SoccerTeam("SHS");

        League<SoccerTeam> l1 = new League<>();
        l1.addTeam(t1);
        l1.addTeam(t3);
    }
}
