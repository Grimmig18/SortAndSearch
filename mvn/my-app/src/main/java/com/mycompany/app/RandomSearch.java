package com.mycompany.app;

public class RandomSearch {

    static int randomSearch(int[] array,int searchedNumber){
        int tries = 0;
        int rand = (int)(Math.random()*array.length);
        while(!(array[rand]==searchedNumber)){
            rand = (int)(Math.random()*array.length);
            System.out.println("Wo?");
            tries++;
        }
        System.out.println("DA!");
        System.out.println("Versuche: " + tries);
        return rand;
    }
}
