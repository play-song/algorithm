package programmer;

public class FindMiddleValue {
  public static void main(String[] args) {

    int[] items = {1, 7, 5, 10, 11};

    for (int i = 0; i < items.length; i++) {
      for (int j = 0; j < items.length - i -1; j++) {
        int temp = items[j+1];
        if(items[j] > items[j+1]) {
          items[j+1] = items[j];
          items[j] = temp;
        }
      }
    }

    System.out.println(items.length / 2);
  }
}
