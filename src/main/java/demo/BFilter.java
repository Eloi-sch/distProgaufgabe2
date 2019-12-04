package demo;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.hash.Hashing.murmur3_128;
import static java.lang.Math.abs;


public class BFilter {
    private int n;
    private int m;
    private int k;
    private double p;
    private List<Boolean> bitArray;
    private List<Boolean> tmpArray;

    public BFilter(int n, double p) {
        this.p = p;
        this.n = n;
        this.m = (int) Math.ceil(-((n * Math.log(p)) / (Math.log(2) * Math.log(2))));
        this.k = (int) Math.ceil(-((Math.log(p)) / (Math.log(2))));
        this.bitArray = new ArrayList<>();
        for(int i =0;i<m;i++){
            bitArray.add(i,false);
        }
        this.tmpArray = new ArrayList<>();
        for(int i =0;i<m;i++){
            tmpArray.add(i,false);
        }

        System.out.println("Mit n = " + this.n + " und p = " + this.p + " :  m = " + this.m + " und k = " + this.k);
    }

    public void initTmp(){
        for(int i =0;i<m;i++){
            tmpArray.set(i,false);
        }
    }
    public void put(String word) {

        int seed = 0;
        for (int i = 0; i < k; i++) {
            bitArray.set(abs((murmur3_128(seed).hashString(word, StandardCharsets.UTF_8).asInt()%m)), true);
            seed += 1515;
        }

    }
    public void putTmp(String word) {

        int seed = 0;
        for (int i = 0; i < k; i++) {
            tmpArray.set(abs((murmur3_128(seed).hashString(word, StandardCharsets.UTF_8).asInt()%m)), true);
            seed += 1515;
        }

    }
    public boolean mightContain(String word){
        initTmp();
        boolean result = false;
        putTmp(word);
        for(int i=0;i<m;i++){

            if(tmpArray.get(i)==false){
                System.out.println("tmp : "+tmpArray.get(i)+" and bit : "+tmpArray.get(i));
                result = true;
            }
            else if(tmpArray.get(i)==true){
                if(bitArray.get(i)==true){
                    System.out.println("tmp : "+tmpArray.get(i)+" and bit : "+tmpArray.get(i));
                    result = true;
                }
                else{
                System.out.println("tmp : "+tmpArray.get(i)+" and bit : "+tmpArray.get(i));
                return false;
            }}

        }

        return result;
    }

    // Getter and Setter

    public List<Boolean> getBitArray() {
        return bitArray;
    }
    public List<Boolean> getTmpArray() {
        return tmpArray;
    }
}
