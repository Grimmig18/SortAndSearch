package com.mycompany.app;
public class BinarySearchTest{

    public static void main(String[] args) {
        int[] array = new int[100000000];
        for (int i = 0; i<array.length;i++){
            array[i] = i;
        }

        BinarySearch bs = new BinarySearch(array);
        System.out.println(bs.searchNumber(12348578));
    }
}