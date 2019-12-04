package demo;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnel;
import com.google.common.hash.PrimitiveSink;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        BFilter b = new BFilter(3,0.03);
        Word w = new Word();

        //System.out.println(w.getResultate());
        System.out.println(w.getNumber());



        /*b.put("eloi");
        System.out.println(b.getBitArray());
        b.put("abc");
        System.out.println(b.getBitArray());*/

    }
}
