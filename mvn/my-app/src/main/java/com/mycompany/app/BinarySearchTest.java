package com.mycompany.app;
public class BinarySearchTest{

    public static void main(String[] args) {
        int[] array = new int[1000000];
        for (int i = 0; i<array.length;i++){
            array[i] = (int)(i*1.25);
        }

        //BinarySearch bs = new BinarySearch(array);
        //System.out.println(bs.searchNumber(12348578));
        /*
        int index = (int)(Math.random()*array.length);
        int index2 = (int)(Math.random()*array.length);
        int bucket = array[index];
        array[index] = array[index2];
        array[index2] = bucket;
        RandomSort.sortedArray(array);
         */
        System.out.println(RandomSearch.randomSearch(array,4));
    }
}