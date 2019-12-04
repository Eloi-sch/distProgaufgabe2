package demo;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.hash.Hashing.murmur3_128;
import static java.lang.Math.abs;


public class BFilter {
    private int n;
    private int m;
    private int k;
    private double p;
    private List<Boolean> bitArray;

    public BFilter(int n, double p) {
        this.p = p;
        this.n = n;
        this.m = (int) Math.ceil(-((n * Math.log(p)) / (Math.log(2) * Math.log(2))));
        this.k = (int) Math.ceil(-((Math.log(p)) / (Math.log(2))));
        this.bitArray = new ArrayList<>();
        for(int i =0;i<m;i++){
            bitArray.add(i,false);
        }

        System.out.println("Mit n = " + this.n + " und p = " + this.p + " :  m = " + this.m + " und k = " + this.k);
    }

    public List<Boolean> getBitArray() {
        return bitArray;
    }

    public void put(String word) {

        int seed = 0;
        for (int i = 0; i < k; i++) {
            bitArray.set(abs((murmur3_128(seed).hashString(word.toString(), StandardCharsets.UTF_8).asInt()%m)), true);
int j = murmur3_128(seed).hashString(word.toString(), StandardCharsets.UTF_8).asInt();
            System.out.println(abs(j%m)+"    "+bitArray.size());
            seed += 1515;

        }

    }
}
