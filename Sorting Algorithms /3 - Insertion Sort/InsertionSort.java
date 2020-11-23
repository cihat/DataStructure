public class InsertionSort {

  void insertionSort(int[] dizi) {
    int i, j, temp;
    for (i = 1; i < dizi.length; i++) {
      temp = dizi[i];
      j = i - 1;
      // dogru yer buluncaya kadar elemanlar saga bir kaydiriliyor
      while (j >= 0 && dizi[j] > temp) {
        dizi[j + 1] = dizi[j];
        j--;
      }
      // Dogru yere de islenen eleman koyuluyor.
      dizi[j + 1] = temp;
    }
  }

  public static void main(String[] args) {
    InsertionSort insertion = new InsertionSort();
    int dizi[] = { 2, 3, 1, 6, 4, 22, 3, -3, -3123, 22 };
    insertion.insertionSort(dizi);
    for (int i = 0; i < dizi.length; i++) {
      System.out.println(dizi[i] + " ");
    }
  }
}