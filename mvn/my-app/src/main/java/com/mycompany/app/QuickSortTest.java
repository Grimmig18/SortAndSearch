package com.mycompany.app;

public class QuickSortTest {
  public static void main(String[] args) {
    int[] array = new int[10];
    for(int i = 0; i < array.length; i++) {
      array[i] = (int) Math.floor(Math.random() * array.length + 1);
    }

    QuickSort.quickSort(array);

  }
}
