package demo;

import java.util.ArrayList;
import java.util.List;

public class Base{
    private int n;
    private int m;
    private int k;
    private double p;
    private List<Boolean> bitArray;

    public Base(int n, double p){
        this.p = p;
        this.n = n;
        this.m = (int)Math.ceil(-((n*Math.log(p))/(Math.log(2)*Math.log(2))));
        this.k = (int)Math.ceil(-((Math.log(p))/(Math.log(2))));
        this.bitArray = new ArrayList<>(m);

        System.out.println("Mit n = "+ this.n +" und p = "+ this.p +" :  m = " + this.m + " und k = " + this.k);
    }
}
