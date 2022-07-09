package main.java.de.exxcellent.challenge.Processor;

import main.java.de.exxcellent.challenge.Models.*;
import main.java.de.exxcellent.challenge.Reader.*;

import java.util.*;

public interface GenericProcessor<T> {

    List<GenericFile> process(GenericFileReader fileReader);

}
