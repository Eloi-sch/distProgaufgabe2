package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        demo.Base b = new demo.Base(3,0.03);
        demo.Word w = new demo.Word();

        //System.out.println(w.getResultate());
        System.out.println(w.getNumber());

    }
}
