package sort;

import java.util.Arrays;

public class BubbleSort {
  public final int[] result;

  public BubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          var temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    this.result = arr;
  }

  public static void main(String[] args) {
    Arrays.stream(new BubbleSort(new int[]{5, 7, 1, 9}).result)
        .forEach(System.out::println);
  }
}
