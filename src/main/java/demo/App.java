package demo;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {


        Word w = new Word();
        BFilter b = new BFilter(w.getNumber(),0.03);

        for (int i=0;i<w.getNumber();i++
             ) {
            b.put(w.getResultate().get(i));
            System.out.println(i);//chargement
        }

    }
}
