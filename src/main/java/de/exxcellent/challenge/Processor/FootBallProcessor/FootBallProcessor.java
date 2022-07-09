package main.java.de.exxcellent.challenge.Processor.FootBallProcessor;

import main.java.de.exxcellent.challenge.Models.*;
import main.java.de.exxcellent.challenge.Processor.*;
import main.java.de.exxcellent.challenge.Reader.*;

import java.util.*;

public class FootBallProcessor implements GenericProcessor {



    @Override
    public List<FootBallData> process(GenericFileReader genericFileReader ) {
        List<FootBallData> footBallDataList = new ArrayList<>();
        try {
            GenericFile genFile = genericFileReader.readFile();
            List<String[]> fileContentList = genFile.getFileContent();
            for( int i = 0; i < fileContentList.size(); i++){
                String team = fileContentList.get(i)[0];
                int goals = Integer.parseInt(fileContentList.get(i)[6]);
                int goalsAllowed = Integer.parseInt(fileContentList.get(i)[7]);
                FootBallData fd = new FootBallData(genFile.getFileName(),team, goals, goalsAllowed);
                footBallDataList.add(fd);
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return footBallDataList;

    }
}
