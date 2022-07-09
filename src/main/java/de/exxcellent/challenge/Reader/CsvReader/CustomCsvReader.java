package main.java.de.exxcellent.challenge.Reader.CsvReader;


import main.java.de.exxcellent.challenge.Models.*;
import main.java.de.exxcellent.challenge.Reader.*;

import java.io.*;

public class CustomCsvReader implements GenericFileReader {

    private final File file;

    public CustomCsvReader(File file) {
        this.file = file;
    }

    @Override
    public GenericFile readFile() {
        GenericFile genericFile = new GenericFile(file.getName());
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String headerLine = br.readLine();
            String line;
            while ((line = br.readLine()) != null)  {
                String[] splitted = line.split(",");
                genericFile.addContent(splitted);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return genericFile;
    }
}