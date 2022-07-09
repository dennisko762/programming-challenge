package main.java.de.exxcellent.challenge.Models;

public class WeatherData extends GenericFile  {

    private int day;

    private int maxTemp;

    private int minTemp;

    private FileType type = FileType.WEATHER;

    @Override
    public String toString() {
        return "WeatherData{" +
                "day=" + day +
                ", maxTemp=" + maxTemp +
                ", minTemp=" + minTemp +
                '}';
    }

    public WeatherData(String fileName, int day, int maxTemp, int minTemp) {
        super(fileName);
        this.day = day;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
    }

    public int getDay() {
        return day;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

}