package main.java.de.exxcellent.challenge.Models;
import java.util.*;


public class GenericFile {
    private final String fileName;
    private final List<String[]> fileContent;

    public GenericFile(String fileName) {
        this.fileName = fileName;
        this.fileContent = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "GenericFile{" +
                "fileName='" + fileName + '\'' +
                ", fileContent=" + fileContent +
                '}';
    }

    public String getFileName() {
        return fileName;
    }

    public void addContent(String[] slice) {
        this.fileContent.add(slice);
    }

    public List<String[]> getFileContent() {
        return fileContent;
    }

}