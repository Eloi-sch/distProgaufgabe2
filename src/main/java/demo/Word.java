package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Word {

    private final List<String> resultate = new ArrayList<>();

    public Word() throws FileNotFoundException {
        resultate.addAll(readFromFile());

    }

    private List<String> readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"));) {
            return br.lines().map(line -> new String(String.valueOf(line))).collect(Collectors.toList());
        } catch (IOException e) {
            throw new IllegalStateException("unknown file");
        }
    }


    // all getters and setters

    public List<String> getResultate() {
        return resultate;
    }
    public int getNumber(){
        return resultate.size();
    }
}
