package demo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Word {

    private final Set<String> resultate = new HashSet<>();

    public Word() throws FileNotFoundException {
        resultate.addAll(readFromFile());

    }

    private Set<String> readFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("words.txt"));) {
            return br.lines().map(line -> new String(String.valueOf(line))).collect(Collectors.toSet());
        } catch (IOException e) {
            throw new IllegalStateException("unknown file");
        }
    }


    // all getters and setters

    public Set<String> getResultate() {
        return resultate;
    }
    public int getNumber(){
        return resultate.size();
    }
}
