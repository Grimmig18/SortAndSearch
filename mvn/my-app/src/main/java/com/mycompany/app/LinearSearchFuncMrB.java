package com.mycompany.app;

import java.util.ArrayList;
import java.util.stream.Stream;

public class LinearSearchFuncMrB {
    interface LinearS {
        int Search(int n);
    }

    public static void SearchInt(LinearS search, int search1){
        search.Search(search1);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i<10000; i++) {
            list.add( (int) (Math.random() * 1000) );
        }

        LinearS search = (str) -> {
            Stream<Integer> stream1 = list.stream();
            stream1.forEach( (str1) -> {
                if( str == str1) {
                    System.out.println(list.indexOf(str1));
                }

            });
            return 1;
        };

        SearchInt(search, 1);

    }
}
