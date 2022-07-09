package main.java.de.exxcellent.challenge.Processor.WeatherProcessor;

import main.java.de.exxcellent.challenge.Models.*;
import main.java.de.exxcellent.challenge.Processor.*;
import main.java.de.exxcellent.challenge.Reader.*;

import java.util.*;

public class WeatherProcessor implements GenericProcessor {


    @Override
    public List<WeatherData> process(GenericFileReader genericFileReader ) {
        List<WeatherData> weatherDataList = new ArrayList<>();
        try {
            GenericFile genFile = genericFileReader.readFile();
            List<String[]> fileContentList = genFile.getFileContent();
            for( int i = 0; i < fileContentList.size(); i++){
                int day = Integer.parseInt(fileContentList.get(i)[0]);
                int maxTemp = Integer.parseInt(fileContentList.get(i)[1]);
                int minTemp = Integer.parseInt(fileContentList.get(i)[2]);
                WeatherData wd = new WeatherData(genFile.getFileName(), day, maxTemp, minTemp);
                weatherDataList.add(wd);
            }

        }catch (Exception e){
            System.out.println(e);
        }
        return weatherDataList;

    }
}
