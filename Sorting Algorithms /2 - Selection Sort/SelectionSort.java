public class SelectionSort {

  void selectionSort(int[] dizi) {
    int i, j, min, temp;
    for (i = 0; i < dizi.length; i++) {
      min = i; // * ilk başta ilk elemanı minimum olarak atıyoruz. Ve listeyi gezerek en küçük
               // elemanı bulduğumuzda min değişkenine atıyoruz.
      for (j = i + 1; j < dizi.length; j++) {
        if (dizi[j] < dizi[min]) {
          min = j; // * Eğer bir sonraki eleman minimumdan daha küçük ise onu minimum olarak
                   // atıyoruz.
        }
      }

      if (min != i) { // * Karşılaşturmamız sonuç verdi ise swap işlemini gerçekleştiriyoruz.
        temp = dizi[i];
        dizi[i] = dizi[min];
        dizi[min] = temp;
      }
    }
  }

  public static void main(String[] args) {
    SelectionSort a = new SelectionSort();
    int dizi[] = { 5, 7, 2, 9, 6, 1, 3 };
    a.selectionSort(dizi);
    for (int i = 0; i < dizi.length; i++) {
      System.out.println(dizi[i] + "");
    }
  }
}
