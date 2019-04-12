package com.mycompany.app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinearSearchFuncMrb2 {

    interface LinearSearch {
        List Search(int n);
    }

    public static void SearchInt(LinearSearch search, int search1){
        search.Search(search1);
    }

    public static void main(String[] args) {

        int[] zahlen = {0,1,2,1,4,1,6,1,2,1};

        //int [] zahlen = new int [10];

        //for (int i=0; i<10; i++)
        //  zahlen[i] = (int) (Math.random() *10);

        for (int i : zahlen) {
            System.out.print(i + ",");
        }

        LinearSearch search = (str) -> {
            List list = IntStream
                    .range(0, zahlen.length-1)
                    .filter(i -> zahlen[i] == str)
                    .mapToObj(i -> i)
                    .collect(Collectors.toList());

            System.out.println("");
            System.out.println(list.toString());

            return list;
        };

        SearchInt(search, 1);
    }

}
