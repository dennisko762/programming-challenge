package main.java.de.exxcellent.challenge.Analyzer.AnalyzerFactory;

import main.java.de.exxcellent.challenge.Analyzer.*;
import main.java.de.exxcellent.challenge.Analyzer.FootballAnalyzer.*;
import main.java.de.exxcellent.challenge.Analyzer.WeatherAnalyzer.*;
import main.java.de.exxcellent.challenge.Models.*;

public class AnalyzerFactory {

    public AnalyzerFactory() {
    }

    public GenericAnalyzer getAnalyzer(FileType type) throws Exception {
        GenericAnalyzer analyzer = null;
        switch (type){
            case FOOTBALL:
                analyzer = new FootballAnalyzer();
                break;
            case WEATHER:
                analyzer = new WeatherAnalyzer();
                break;
            default:
                throw new Exception("FileType: "  + type + "not found!");
        }
        return analyzer;
    }
}
