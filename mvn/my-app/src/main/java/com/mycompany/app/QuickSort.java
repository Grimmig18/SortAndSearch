package com.mycompany.app;

public class QuickSort {
  public static int[] quickSort(int[] unsorted) {
    //Choose Pivot element
    int pivot = unsorted[unsorted.length - 1];
    int currentPivotIndex = unsorted.length - 1;

    int right = 0;
    int left = unsorted.length - 2;

    for(right = 0; right < unsorted.length - 1; right++) {
      if(unsorted[right] >= pivot) {
        // Move Element to the right side
        for(; left > right; left--) {
          if(unsorted[left] < unsorted[right]) {
            int temp = unsorted[right];
            unsorted[right] = unsorted[left];
            unsorted[left] = temp;
            break;
          }
        }
      }
    }

    for(int i = unsorted.length - 2; i >= 0; i--) {
      if(unsorted[i] < pivot) {
        int temp = unsorted[i + 1];
        unsorted[i + 1] = pivot;
        pivot = temp;
        currentPivotIndex = i;
        break;

      }
    }

    return unsorted;
  }
}
