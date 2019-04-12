package com.mycompany.app;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LinearSearchFuncMrb2 {

    interface LinearSearch {
        List Search(int [] arr, int n);
    }

    public static void SearchInt(LinearSearch search, int [] arr, int search1){
        search.Search(arr, search1);
    }

    public static void main(String[] args) {

        //int[] zahlen = {0,1,2,1,4,1,6,1,2,1};

        int [] zahlen = new int [50];

        for (int i=0; i<50; i++)
          zahlen[i] = (int) (Math.random() *50);

        for (int i : zahlen) {
            System.out.print(i + ",");
        }

        LinearSearch search = (arr, str) -> {
            List list = IntStream
                    .range(0, arr.length)
                    .filter(i -> arr[i] == str)
                    .mapToObj(i -> i)
                    .collect(Collectors.toList());

            System.out.println("");
            System.out.println(list.toString());

            return list;
        };

        SearchInt(search, zahlen,1);
    }

}
