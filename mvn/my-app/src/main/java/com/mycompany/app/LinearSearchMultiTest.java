package com.mycompany.app;

public class LinearSearchMultiTest
{
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * array.length + 1);

            System.out.println(array[i]);
        }

        LinearSearchMulti searchMulti = new LinearSearchMulti(array, 4);


        System.out.println(searchMulti.search(1));

    }
}
