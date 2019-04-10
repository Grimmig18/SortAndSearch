package com.mycompany.app;

public class RandomSort {

    static int[] sortedArray(int [] array){
        int length = array.length;
        int j = 0;
        while(!sortiert(array)){
            int index = (int)(Math.random()*length);
            int index2 = (int)(Math.random()*length);
            int bucket = array[index];
            array[index] = array[index2];
            array[index2] = bucket;
            j++;
        }
        System.out.println("Versuche: " + j);
        return array;
    }

    private static boolean sortiert(int [] array){
        int i = 0;
        while(array[i]<array[i+1]){
            if(i == (array.length-2)){
                System.out.println("AYO");
                return true;
            }
            i++;
        }
        System.out.println("Nö");
        return false;
    }
}
