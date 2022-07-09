package main.java.de.exxcellent.challenge.Reader.ReaderFactory;

import main.java.de.exxcellent.challenge.Reader.CsvReader.*;
import main.java.de.exxcellent.challenge.Reader.*;
import main.java.de.exxcellent.challenge.Reader.JsonReader.*;
import main.java.de.exxcellent.challenge.Reader.SpreadSheetReader.*;

import java.io.*;

public class ReaderFactory {
    public ReaderFactory(){

    }
    public GenericFileReader getFileReader(File file) throws Exception {
        String fileName = file.getName();
        String fileExtension = fileName.substring(fileName.lastIndexOf("."));

        if(file == null){
            return null;
        } else
        if (fileExtension.equals(".csv")) {
            return new CustomCsvReader(file);
        } else
        if (fileExtension.equals(".xlsx") || fileExtension.equals(".xls")) {
            return new CustomSpreadSheetReader(file);
        } else

        if (fileExtension.equals(".json")) {
            return new CustomJsonReader(file);
        }
        return null;

    }


}