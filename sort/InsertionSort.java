package sort;

import java.util.Arrays;

public class InsertionSort {
  public final int[] result;

  public InsertionSort(int[] arr) {
    for (int i = 1; i < arr.length - 1; i++) {
      int insertingData = arr[i];
      int j;
      for (j = i - 1; j >= 0; j--) {
        if(arr[j] > insertingData) {
          arr[j + 1] = arr[j];
        } else {
          break;
        }
      }

      arr[j + 1] = insertingData;
    }
    this.result = arr;
  }

  public static void main(String[] args) {
    Arrays.stream(new InsertionSort(new int[]{4, 3, 1, 2, 5}).result)
        .forEach(System.out::println);


  }
}
