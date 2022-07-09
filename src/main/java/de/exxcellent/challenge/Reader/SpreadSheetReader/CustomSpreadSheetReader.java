package main.java.de.exxcellent.challenge.Reader.SpreadSheetReader;

import main.java.de.exxcellent.challenge.Models.*;
import main.java.de.exxcellent.challenge.Reader.*;

import java.io.*;
//This is just a dummy Class mean to be used in the Factory for demonstration purposes
//This class can be extended in the future to implement specific spreadsheet reader
public class CustomSpreadSheetReader implements GenericFileReader {

    private final File file;

    public CustomSpreadSheetReader(File file) {
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
