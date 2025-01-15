package sort;

import java.util.Arrays;

public class SelectionSort {
  private final int[] result;

  public SelectionSort(int[] arr) {
    for (int i = 0; i < arr.length-1; i++) {
      int minIndexValue = i;
      for (int j = i+1; j < arr.length; j++) {
          if(arr[j] < arr[minIndexValue]) {
            minIndexValue = j;
          }
      }

      int temp = arr[i];
      arr[i] = arr[minIndexValue];
      arr[minIndexValue] = temp;
    }

    result = arr;
  }

  public static void main(String[] args) {
    Arrays.stream(new SelectionSort(new int[]{5, 7, 1, 9}).result)
        .forEach(System.out::println);
  }
}
