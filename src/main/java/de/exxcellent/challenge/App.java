package main.java.de.exxcellent.challenge;

import main.java.de.exxcellent.challenge.Analyzer.AnalyzerFactory.*;
import main.java.de.exxcellent.challenge.Analyzer.*;
import main.java.de.exxcellent.challenge.Models.*;
import main.java.de.exxcellent.challenge.Processor.*;
import main.java.de.exxcellent.challenge.Processor.ProcessorFactory.*;
import main.java.de.exxcellent.challenge.Reader.*;
import main.java.de.exxcellent.challenge.Reader.ReaderFactory.*;

import java.io.*;
import java.util.*;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) throws Exception {

        // Your preparation code …

        // 1. Create a file. This can be any file, weather its json, csv, cls
        File weatherFile = new File("B:/programming-challenge/src/main/resources/de/exxcellent/challenge/weather.csv");
        File footBallFile = new File("B:/programming-challenge/src/main/resources/de/exxcellent/challenge/football.csv");

        //2. Instantiate all Factory classes. We use the factory pattern as we want to keep the program extendible
        ReaderFactory readerFactory = new ReaderFactory();
        ProcessorFactory processorFactory = new ProcessorFactory();
        AnalyzerFactory analyzerFactory = new AnalyzerFactory();

        //3. Instantiate the reader, processor and analyzer
        GenericFileReader genericFileReader = readerFactory.getFileReader(footBallFile);
        GenericProcessor processor = processorFactory.getProcessor(FileType.FOOTBALL);
        GenericAnalyzer analyzer = analyzerFactory.getAnalyzer(FileType.FOOTBALL);

        //4. Get the relevant data from the reader
        List<GenericFile> data = processor.process(genericFileReader);


        //5. Analysis. Here we can call our analysis methods.
        int dayWithMinTempSpreadIndex = analyzer.findMinValue(data);
        //int teamWithSmallestGoalSpreadIndex = analyzer.findMinValue(data);


        List<? extends GenericFile> weatherData = data;
        List<? extends GenericFile> footBallData = data;
        //6. Print answers. Since both types have different attributes, casting was necessary in order to access type specific getters.
        //int dayWithSmallestTempSpread = ((WeatherData)weatherData.get(dayWithMinTempSpreadIndex)).getDay();     // Your day analysis function call …
        //System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        // Your goal analysis function call …
        String teamWithSmallestGoalSpread = ((FootBallData)footBallData.get(dayWithMinTempSpreadIndex)).getTeam();     // Your day analysis function call …
        System.out.printf("Team with smallest goal spread : %s%n", teamWithSmallestGoalSpread);


    }


}
