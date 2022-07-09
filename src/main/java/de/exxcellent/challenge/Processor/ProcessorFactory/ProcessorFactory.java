package main.java.de.exxcellent.challenge.Processor.ProcessorFactory;

import main.java.de.exxcellent.challenge.Models.*;
import main.java.de.exxcellent.challenge.Processor.*;
import main.java.de.exxcellent.challenge.Processor.FootBallProcessor.*;
import main.java.de.exxcellent.challenge.Processor.WeatherProcessor.*;

public class ProcessorFactory {

    public ProcessorFactory() {
    }

   public GenericProcessor getProcessor(FileType type) throws Exception {
    GenericProcessor gp = null;
    switch (type) {
        case WEATHER:
            gp = new WeatherProcessor();
            break;
        case FOOTBALL:
            gp = new FootBallProcessor();
            break;
        default:
            throw new Exception("FileType: "+ type + "could not be found");
    }
    return gp;
    }
}
