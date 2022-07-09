package main.java.de.exxcellent.challenge.Analyzer.WeatherAnalyzer;

import main.java.de.exxcellent.challenge.Analyzer.*;
import main.java.de.exxcellent.challenge.Models.*;

import java.util.*;

public class WeatherAnalyzer implements GenericAnalyzer {

    public int minTempSpread(List<WeatherData> weatherData) {
        List<Integer> minTempSpread = new ArrayList<>();
        for(WeatherData data: weatherData) {
            minTempSpread.add((data.getMaxTemp()-data.getMinTemp()));
        }
        return Collections.min(minTempSpread);

    }
    @Override
    public int findMinValue(List<GenericFile> weatherData)  {
        List<? extends GenericFile> data = weatherData;
        return this.minTempSpread((List<WeatherData>) data);

    }
}
