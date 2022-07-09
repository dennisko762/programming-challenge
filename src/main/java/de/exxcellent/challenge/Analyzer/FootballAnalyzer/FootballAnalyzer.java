package main.java.de.exxcellent.challenge.Analyzer.FootballAnalyzer;

import main.java.de.exxcellent.challenge.Analyzer.*;
import main.java.de.exxcellent.challenge.Models.*;

import java.util.*;

public class FootballAnalyzer implements GenericAnalyzer {

    public int getMinGoalSpreadList(List<FootBallData> list) {
        List<Integer> goalSpreadList = new ArrayList<>();
        for(FootBallData data: list){
            goalSpreadList.add(Math.abs(data.getGoalsAllowed()- data.getGoals()));

        }
        return Collections.min(goalSpreadList);
    }
    @Override
    public int findMinValue(List<GenericFile> list) {
        List<? extends GenericFile> data = list;
       return getMinGoalSpreadList((List<FootBallData>) data);
    }
}
