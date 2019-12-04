package demo;

import java.io.FileNotFoundException;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

BFilter test = new BFilter(3,0.03);

test.put("eloi");
test.put("benoit");
test.put("vincent");
System.out.println(test.getBitArray());
        System.out.println(test.mightContain("eloi"));

        System.out.println(test.getBitArray());
        System.out.println(test.getTmpArray());


        System.out.println(test.mightContain("gdshgsdfhfdshdfshdsfui"));

        System.out.println(test.getBitArray());
        System.out.println(test.getTmpArray());

        /*Word w = new Word();
        BFilter b = new BFilter(w.getNumber(),0.03);

        System.out.println(b.getBitArray());
        for (int i=0;i<w.getNumber();i++
             ) {
            b.put(w.getResultate().get(i));
            //System.out.println(i);//chargement
        }
        System.out.println(w.getResultate());
        //System.out.println(b.getBitArray());
        //System.out.println(b.mightContain("eloi"));
        //System.out.println(b.mightContain("abased"));*/
    }
}
