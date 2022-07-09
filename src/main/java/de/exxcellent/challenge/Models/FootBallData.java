package main.java.de.exxcellent.challenge.Models;

public class FootBallData extends GenericFile  {

    private String team;
    private int goals;
    private int goalsAllowed;
    private FileType type = FileType.FOOTBALL;
    public FootBallData(String fileName, String team, int goals, int goalsAllowed) {
        super(fileName);
        this.team = team;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
    }

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    @Override
    public String toString() {
        return "FootBallData{" +
                "team='" + team + '\'' +
                ", goals=" + goals +
                ", goalsAllowed=" + goalsAllowed +
                '}';
    }
}
