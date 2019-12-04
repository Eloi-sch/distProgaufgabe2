package demo;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Word w = new Word();
        BFilter b = new BFilter(w.getNumber(),0.03);//p=0.03 -> default value AND w.getNumber() is n

        for (int i=0;i<w.getNumber();i++
             ) {
            b.put(w.getResultate().get(i));
        }

        /*------------------------------------------------------------------------------------------*/

        System.out.println(b.mightContain("abased"));//true
        System.out.println(b.mightContain("monarchs"));//true
        System.out.println(b.mightContain("monalisa"));//true
        System.out.println(b.mightContain("doctrine"));//true

        System.out.println(b.mightContain("jfsdgusdhqsfdkfldsjdlfkjfd"));//false
        System.out.println(b.mightContain("atr"));//false

        System.out.println(b.mightContain("bn"));//false positive
        System.out.println(b.mightContain("elo"));//false positive
        System.out.println(b.mightContain("ben"));//false positive


    }
}
