package com.mycompany.app;

import java.util.ArrayList;

public class QuickSortFunc {
    static ArrayList<Integer> quickSort(ArrayList <Integer> a){
        if (a.size() <= 1) return a;
        else {
            Pair p = divide(a);
            ArrayList <Integer> b = quickSort(p.first);
            b.add(a.get(0));
            b.addAll(quickSort(p.second));
            return b;
        }
    }

    static Pair divide(ArrayList<Integer> a) {
        int pivot = a.get(0);
        ArrayList <Integer> b = new ArrayList <Integer>();
        ArrayList <Integer> c = new ArrayList <Integer>();

        for (int i =1; i<a.size(); i++)
            if (a.get(i) < pivot) b.add(a.get(i));
            else c.add(a.get(i));
        return new Pair(b, c);
    }

    public static void main(String[] args) {
        ArrayList <Integer> b = new ArrayList<Integer>();
        for (int i=0; i<100; i++) {
            b.add( (int) (Math.random() *100) );
        }

        ArrayList <Integer> a = quickSort(b);
        for(int ausgabe : a)
        {
            System.out.println(ausgabe);
        }
    }
}
