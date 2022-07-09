package main.java.de.exxcellent.challenge.Reader.JsonReader;

import main.java.de.exxcellent.challenge.Models.*;
import main.java.de.exxcellent.challenge.Reader.*;

import java.io.*;
//This is just a dummy Class mean to be used in the Factory for demonstration purposes
//This class can be extended in the future to implement specific json reader
public class CustomJsonReader implements GenericFileReader {

    private final File file;

    public CustomJsonReader(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    @Override
    public GenericFile readFile() {
        return null;
    }
}
