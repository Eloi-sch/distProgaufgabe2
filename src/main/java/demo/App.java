package demo;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        Word w = new Word();
        BFilter filter1 = new BFilter(w.getNumber(),0.03);//p=0.03 -> default value AND w.getNumber() is n
        for (int i=0;i<w.getNumber();i++
             ) {
            filter1.put(w.getResultate().get(i));
        }
        System.out.println("1) abased liegt in filter1 :"+filter1.mightContain("abased"));//true
        System.out.println("2) monarchs liegt in filter1 :"+filter1.mightContain("monarchs"));//true
        System.out.println("3) monalisa liegt in filter1 :"+filter1.mightContain("monalisa"));//true
        System.out.println("4) doctrine liegt in filter1 :"+filter1.mightContain("doctrine"));//true

        System.out.println("5) jfsdgusdhqsfdkfldsjdlfkjfd liegt in filter1 :"+filter1.mightContain("jfsdgusdhqsfdkfldsjdlfkjfd"));//false
        System.out.println("6) atr liegt in filter1 :"+filter1.mightContain("atr"));//false

        System.out.println("7) bn liegt in filter1 :"+filter1.mightContain("bn"));//false positive
        System.out.println("8) elo liegt in filter1 :"+filter1.mightContain("elo"));//false positive

System.out.println("test with filter 2");

        BFilter filter2 = new BFilter(w.getNumber(),0.01);
        for (int i=0;i<w.getNumber();i++
        ) {
            filter2.put(w.getResultate().get(i));
        }
        System.out.println("1) abased liegt in filter1 :"+filter2.mightContain("abased"));//true
        System.out.println("2) monarchs liegt in filter1 :"+filter2.mightContain("monarchs"));//true
        System.out.println("3) monalisa liegt in filter1 :"+filter2.mightContain("monalisa"));//true
        System.out.println("4) doctrine liegt in filter1 :"+filter2.mightContain("doctrine"));//true

        System.out.println("5) jfsdgusdhqsfdkfldsjdlfkjfd liegt in filter1 :"+filter2.mightContain("jfsdgusdhqsfdkfldsjdlfkjfd"));//false
        System.out.println("6) atr liegt in filter1 :"+filter2.mightContain("atr"));//false

        System.out.println("7) bn liegt in filter1 :"+filter2.mightContain("bn"));//false
        System.out.println("8) elo liegt in filter1 :"+filter2.mightContain("elo"));//false

    }
}
